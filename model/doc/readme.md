
```drawio-resource
../orgdesign.drawio
```

An Ecore micro-model of organizational design: units, roles, people, capabilities, decision rights, coordination mechanisms, and the environment they answer to - modeled as periods in time, aligned to the estate they own, and generated into documentation rather than drawn into a deck.

[TOC levels=6]

## Position in the tower

The aspect spine of the [Nasdanika model tower](https://nasdanika.com/models.html) runs

> [nxcore](https://nxcore.models.nasdanika.org/) < [role](https://role.models.nasdanika.org/) < [iam](https://iam.models.nasdanika.org/) < [seal](https://seal.models.nasdanika.org/) < [lifecycle](https://lifecycle.models.nasdanika.org/) < [decision analysis](https://analysis.decision.models.nasdanika.org/) < [decision binding](https://binding.decision.models.nasdanika.org) < [governance](https://governance.models.nasdanika.org/) < [work](https://work.models.nasdanika.org/) < [requirements](https://requirements.models.nasdanika.org/) < [architecture](https://architecture.models.nasdanika.org/) < [threat](https://threat.models.nasdanika.org/)

and the enterprise branch continues off the top of it:

> … < threat < [capability](https://capability.models.nasdanika.org/) < [product management](https://product-management.models.nasdanika.org/) < **org design**

This model is the second top floor of that branch, and almost nothing it needs is declared in it. An `OrganizationalUnit` extends the product management model's `CapabilityProvider`, which extends the capability model's `AbstractCapabilityProvider`, which lands on the threat model's `Asset`, the architecture model's `Element`, work's `Workable`, governance's `Governed`, lifecycle's `Staged`, seal's `SealedElement`, IAM's `Subject`, role's `Undergoer`, and nxcore's `NamedPeriod`.
So a team, before this model says anything about it, already carries:

* an owner, a sponsor, and an approver - as **role** engagements with dated validity, not as string attributes;
* access control - a unit is an IAM `Subject` and an `AccessControlled` resource, so "who may see this part of the org model" is typed rather than a wiki permission;
* signable records - a reorg approval is a **seal** `Signature` on the record that needed it;
* a lifecycle - proposed, forming, active, sunsetting, dissolved are **lifecycle** `Stage`s, and the dates a unit occupied each are `Sojourn`s that are never rewritten;
* the decision that created it - a **decision analysis** `Alternative` with recorded expert judgments, committed through a **decision binding** into the structure that exists;
* controls, risks, and waivers - a unit is **governed**, so segregation-of-duties controls and key-person risks attach to it in the same catalog the compliance program runs on;
* work - reorganizations, hiring plans, and remediation are **work** on the unit, because `Element` is `Workable`;
* a place in the estate - a unit is an **architecture** `Element`, addressable from any other model that needs to point at an owner;
* threats - a unit is an `Asset`; insider risk and key-person concentration are threats against it, promoted into the same risk register as everything else;
* capabilities and the concerns they answer - from **capability** and **product management**, which is what makes duplication a query rather than a steering-committee discovery.

It also depends on [AI governance](https://ai.governance.models.nasdanika.org/)).
Two reasons for taking the AI governance branch: it does not hurt those who never touch AI, and nowadays AI is everywhere.

What org design adds on top of that is small and specific: the structural vocabulary (units, reporting lines, unit kinds), the coordination vocabulary, decision rights, the environment the design is a response to, and the fit rules that connect the three.
Everything else was inherited, which is the point of the tower.

One thing arrives sideways rather than from below.
The [accounting model](https://accounting.models.nasdanika.org/) is a balcony off the tower rather than a floor in the spine.
Org design depends on it so that an `OrganizationalUnit` can contain `Account`s.
That is the only dependency here which is not part of the branch this model sits on, and it is what makes [cash flow a projection of structure](#cash-flow-as-a-projection-of-structure).

## Competitive landscape

Everyone draws the org chart. Almost nobody models the organization.

**HR systems of record.** Workday, SAP SuccessFactors, Oracle HCM, BambooHR, HiBob.
Authoritative for who reports to whom, and rightly so - payroll depends on it. But a supervisory hierarchy is not a design.
These systems hold positions, cost centers, and effective dates; they hold no capabilities, no decision rights, no coordination mechanisms, and no statement of what the structure was supposed to achieve.
The design rationale lives in a deck that was presented once.

**Org design and workforce analytics platforms.** OrgVue, Functionly, Nakisa, ChartHop.
The most serious camp: scenario modeling, span-and-layer analytics, cost-to-serve, what-if headcount.
Their shape is the limitation.
The unit of analysis is the employee record imported from the HRIS, the scenarios are spreadsheets with a good renderer, and the model is per-engagement and proprietary.
Nothing in an OrgVue scenario can be referenced by an architecture model, a risk register, or a build.

**Org chart and diagramming tools.** Lucidchart, Miro, Visio, Pingboard, Google Slides.
Free, approachable, and the diagram *is* the model - the same critique the threat model makes of DFD editors.
The chart is accurate on the day of the reorg announcement and starts rotting at export.

**EA suites and frameworks.** ArchiMate's business layer (`BusinessActor`, `BusinessRole`, `BusinessCollaboration`), TOGAF, UAF, and the platforms implementing them - LeanIX, Ardoq, Bizzdesign, MEGA HOPEX.
Closest in ambition, and the organization is the part they treat most thinly: a handful of business-layer types, hand-maintained, disconnected from the HRIS on one side and from the code on the other.
Team Topologies vocabulary has been bolted onto several of them recently, which is a good instinct expressed as a fixed enum in a proprietary repository.

**Developer portals and ownership catalogs.** Backstage's groups and owners, Cortex, OpsLevel, Port.
The most instructive comparison, as it is for the [architecture](https://architecture.models.nasdanika.org/) and [Maven](https://maven.models.nasdanika.org/) models: a tiny entity model as YAML in git, widely adopted precisely because it is small and federated.
But the group tree is hand-written, drifts from the HRIS the week after it is committed, ownership is a string, and the "team" in the portal has no typed relationship to the team in the HRIS, the team in the EA tool, or the team on the reorg slide.

**Method literature, and its one piece of tooling.** Mintzberg's configurations, Galbraith's Star, Nadler–Tushman congruence, Team Topologies, and - the direct ancestor of `FitRule` - Burton and Obel's contingency framework with the OrgCon expert system built on it.
OrgCon got the central idea right decades ago: organizational design is a fit problem, misfits are detectable, and detection can be mechanical.
It was a standalone diagnostic product with a private knowledge base, and it modeled nothing else in the enterprise.

**Headcount-driven financial planning.** Anaplan, Workday Adaptive Planning, Pigment, Causal, and the workforce-planning module of every ERP.
They are the only tools in the landscape that connect structure to money, and they do it by re-entering the organization as a driver table: a roster tab, a cost-per-grade tab, a start-date column, and a set of formulas fanning out from them.
The driver table is a copy of the org chart with a different refresh cycle, and the two disagree within a quarter.
When a requisition slips, the start date is edited by hand in the plan and nowhere else, and the reason it moved is not in either artifact.

**Directories.** Entra ID, Okta, LDAP, SCIM.
Authoritative for identity and group membership, and a source for this model rather than a rival - see [Authoring and loading](#authoring-and-loading).

The actual competitor is the org chart in PowerPoint, the RACI spreadsheet attached to the project charter, the "who owns what" page on the wiki, and the tribal knowledge of the one person who has been there nine years.

## What a typed model adds

**Org units are periods, not rows.** Everything named in this model is an nxcore `NamedPeriod` - a unit, a role, an assignment, a capability provision, a coordination mechanism.
"The Payments tribe" is not a row that gets updated; it is a thing with a start, possibly an end, and a history that survives the update.
Last year's structure remains answerable, which is the difference between an org model and an org chart.

**Time can be relative, and that changes what a plan is.** A `Temporal` may be anchored to another temporal and offset by a duration instead of carrying an instant.
"Hire a project manager" is an event - the start of a role assignment.
The hiring process is expressed *backward* from that event: post the position ninety days before, screen sixty days before, interview thirty days before, offer two weeks before.
Onboarding is expressed *forward* from the same event: provision access on day one, complete mandatory training within thirty days, first solo delivery at ninety.
None of it requires a date.
When an offer is accepted and a real instant lands on the anchor, every relative temporal on both sides resolves by composition, and the resolved instant carries the chain of anchors and offsets that produced it.
Nothing is edited; the plan is the same plan with a different calendar projection.

**Organizations are reactive, in the reactive-streams sense.** Hiring takes longer than ninety days, or less.
In a date-based plan every downstream item is edited by hand, and the edits are themselves a source of error and quiet revision.
Here the downstream items are expressed against the anchor, so the anchor moving *is* the reschedule.
`lowerBounds` and `upperBounds` express the constraints that actually hold - "not before the fiscal year opens, not after the audit" - without committing to dates nobody knows.
The consumer signals demand, the producer responds, and back-pressure is honest rather than theatrical.

**Kinds are instance data, not metamodel classes.** Unit kinds, coordination kinds, and environment dimensions are catalogs, following the rule the architecture model applies to `ElementKind`.
Mintzberg's six configurations, Team Topologies' four team types and three interaction modes, Galbraith's Star points, and an organization's own grade ladder all load as instance data.
Adding a vocabulary is authoring, not a metamodel release, and a unit classified under two vocabularies at once is a many-to-many reference rather than an argument about which enum wins.

**Capability overlap is structural, not political.** A unit's delivered capabilities are the same `Capability` objects the product management model pulls by persona concern.
Two tribes independently claiming the same capability for the same personas is a query over the federated graph, surfaced before the steering committee rather than during it.
It is the pull-versus-push thesis of the [product management model](https://product-management.models.nasdanika.org/), applied to structure.

**Decision rights are bindings, not a RACI column.** A decision right is the authority to commit a variation point - which is what the decision binding model's `Binding` is, and what the decision analysis model's `Alternative` and `Judgment` record on the way there.
Combined with IAM, "who may decide this" is a permission over a typed target, and "who actually decided it, when, on what evidence, with whose sign-off" is a signed sojourn.
Segregation of duties becomes demonstrable from the record instead of asserted in a policy document.

**Fit is inspectable.** A `FitRule` states an expected relationship between design dimensions - environment uncertainty against decision centralization, capability complexity against coordination mechanism, span of control against standardization.
Rules are evaluated by the [rules model](https://rules.models.nasdanika.org/) as inspectors producing violations with severity and waivers, over the whole federated model, in CI.
Contingency-theory misfit diagnostics stop being a consulting deliverable and become a build step.

**People resolve to people.** A `Person` is an IAM `Principal` and a role `Actor`.
The email in a POM's `<developer>` element, the committer on a git commit, the assignee on a Jira issue, and the account in the corporate directory are four independent signals about the same person, and this model is where they meet. Where they disagree, someone should look.

## Applications

### Education

Most people know their own box on the chart and the three boxes nearest it.
The generated site - every type, every feature, with diagrams and cross-references, plus loaded catalogs for Mintzberg, Galbraith, and Team Topologies - is a browsable reference for how organizations are put together and how the choices trade off.

The interesting version, as with the [Maven model](https://maven.models.nasdanika.org/), is organizational.
Every organization constrains its own design heavily: mandated grade ladders, committee charters, approval thresholds, span-of-control policy, which roles may exist in which unit kinds.
A central function takes the generic documentation and publishes an org-specific edition where those constraints are stated next to the element they constrain; divisions specialize further.
The documentation of the vocabulary and the documentation of the policy become one artifact.

### Documentation generation

Model an organization and generate its site: unit pages with charters, capabilities, and owners; role pages with required capabilities, decision rights, and reporting lines;
capability pages listing every unit that claims them; coordination mechanism pages with cadence and participants;
a strategy page tracing goals to the capabilities that serve them and the environment factors that motivated them.
Site structure follows unit containment, the way the architecture model derives a [micro-wiki](https://nasdanika.com/stories/2026/micro-wikis.html)'s space hierarchy from element containment.

### Understanding an organization

The most mundane application, and the one that pays back fastest.

**Consultants** arrive with a fixed budget for discovery and spend most of it reconstructing structure from interviews.
A model built during discovery is a deliverable in its own right, is diffable against the same model six months later, and does not evaporate when the engagement closes.

**New hires** get a structure they can traverse instead of an org chart PDF and a Confluence space.
"Who owns this capability, which unit are they in, who do they coordinate with, what do I need approval for, and who grants it" become questions with answers.

**Liaisons** - vendor and partner account managers, embedded delivery leads, alliance managers - capture the aspects of the client organization they need in order to work efficiently with its internal teams: which unit decides, which implements, which must be consulted, at what cadence, under which coordination mechanism.
Because the model federates, the same account manager can publish a model of *their own* organization for the client to consume, by reference rather than by copy.
Both sides end up with a shared, typed picture of the seam between them - the artifact that today exists only as competing assumptions in two CRMs.

### Cross-functional and new projects

A project does not need the whole organization; it needs the slice that participates.
Model Bill from Product, Joe from Risk, and Jim from Technology as `Person`s with role assignments into a project unit alongside their home units, and the model states what is otherwise negotiated informally: which decisions the project may take and which escalate, which capabilities each participant's home unit brings, what the coordination mechanism and cadence are, and where the reporting lines cross.
Matrix structures are exactly where verbal understanding fails, and exactly where a typed model is cheapest to build - three people and a week, not a transformation program.

Because a unit is a `Period`, a project unit meant to dissolve carries its dissolution in the model rather than persisting by inertia.

### Org templates

A model authored entirely in relative temporals and unresolved anchors is a template.
A development team template says: a lead, four to six engineers, a product owner at half allocation, a delivery cadence, a defined set of delivered capabilities, decision rights bounded at tactical scope, onboarding work expressed relative to each assignment's start.
Instantiating it against a concrete context produces a bound model without modifying the template - a product launch template, a regulatory approval template, a vendor onboarding template, an acquisition integration template.

Templates are **tunable by grade, not by quality**. A development team in a highly regulated bank and a development team on a game prototype are the same template at different settings: the regulated instance carries mandatory segregation-of-duties controls, four-eyes approval on production changes, a decision right that escalates deployment authority, and evidence obligations on every release;
the prototype instance carries none of them and a much shorter coordination cadence.
Both are complete, honest models of a competent team.
The dial is regulatory grade, risk appetite, and coordination cost - not how good the team is.

This matters because templates expressed in absolute dates and hard-coded controls aren't templates.
They're examples that get copy-pasted and diverge on first use.

A template that contains accounts also says what the team costs, and the grade dial moves that too: four-eyes approval, an evidence obligation, and a mandatory second reviewer are headcount and tooling with a price attached. See below.

### Cash flow as a projection of structure

*An aspect currently being explored rather than a settled part of the model.*

Org units contain [accounting](https://accounting.models.nasdanika.org/) `Account`s.
Because both hierarchies are containment trees, the cost-center structure stops being a parallel coding scheme maintained in the general ledger and reconciled against the org chart once a year - it is the same tree, and the accounting model's rule that role assignments propagate down the account hierarchy with override lines up with how ownership already propagates down units.

What that buys is the same trick the temporal aspect plays, applied to money.
**Every recurring cost in an organization is anchored to an organizational event.** A paycheck series starts at the start of a role assignment and ends at its end.
A laptop, a desk, license seats, and a security review lead the hire by two to four weeks - negative offsets against the same anchor that onboarding already uses.
Severance, license reclamation, and access revocation trail the assignment's end.
A coordination mechanism with a weekly cadence and eight participants has a cost per occurrence. None of it needs a date.

So the cash-flow consequence of a structural decision falls out of the model instead of being recomputed in a workbook:

* "What does this team cost between now and year end" is a fold over the transactions anchored to its assignments.
* "What if the requisition slips a quarter" is the same fold after one anchor moves. Nothing is re-entered, because every offset was relative to that anchor - including the equipment purchase that has to move backward with it.
* "What does this reorg cost" is the difference between two folds over two versions of the structure, both of which the model still holds, because units are periods.

**Facts and intentions stay separate, and that separation is the accounting model's own rule.** Assertions and transactions there are facts; budgets are intentions, deliberately excluded from that metamodel and expected to live in a model that references it.
An org model whose intended cost series hang off org events is a natural home for exactly those intentions: a budget before it has dates, expressed in the shape it actually has.
When the actuals arrive - the real payroll run, the real invoice, the statement balance - they are entries in the ledger, and variance is a comparison between the projected fold and the asserted balance, on the same accounts, with the org event that was supposed to trigger the spend one reference away.

The general ledger remains authoritative for what happened.
What this adds is the anchoring of intent to structure and to time, which is the part no ledger and no planning tool holds.

### A coordinate system for the estate

The application with the largest leverage, and the [Maven model](https://maven.models.nasdanika.org/) states its half of it explicitly: a POM's `<developer>` email stops being a string and becomes an edge into the org hierarchy.

Assets align to org units two ways, and both are worth having:

* **Declaratively** - a POM, a service, a dataset, a control, or a document names its owning unit. Cheap, authoritative when maintained, and wrong about as often as `CODEOWNERS` is.
* **By analysis** - who actually touched it. Commits from the [git](https://git.models.nasdanika.org/) and [GitLab](https://gitlab.models.nasdanika.org/) models resolve committers to `Person`s and `Person`s to units; Jira assignees do the same. Ownership becomes evidence-based and cross-checkable against the declaration.

Once every asset has org coordinates, **asset dependencies project onto organizational dependencies**.
A build graph spanning thousands of modules becomes a graph of unit-to-unit dependencies with weights.
That answers the Conway's-law question from data rather than from opinion: where architecture and organization disagree, the coordination cost shows up as cross-unit edges with no corresponding `CoordinationMechanism`.
A breaking change becomes a list of units to notify rather than a list of repositories.
A proposed reorg can be evaluated against the dependency graph it will have to coordinate across, before it is announced.

### Roll-up of metrics

The org tree is a natural aggregation dimension once assets are aligned to it.
This unit owns *N* modules and *M* lines of code, carries *K* open vulnerabilities weighted by severity, runs this many builds a week, shows this much commit activity, reports this coverage figure - real coverage, via the [coverage model](https://coverage.models.nasdanika.org/) and its transitive analysis - has this many open findings, this many waivers past expiry, this much work in flight and this much aging in stage.
Roll-ups compose up the containment hierarchy; trends come from diffing against a stored baseline.

Money joins that list rather than sitting beside it.
Because units contain accounts, run rate, committed spend, and projected spend to a horizon roll up the same tree as vulnerabilities and coverage, in the same query, at the same moment - so cost per delivered capability and vulnerabilities per dollar are expressible instead of being an integration project between the GL and everything else.

The point is not the dashboard. The point is that every number is a query over one model rather than an extract from seven tools reconciled by hand each quarter - and that clicking a number leads to the modules, the commits, the people, and the entries it came from.

### Analysis

With structure, capabilities, decision rights, and coordination in one graph, the standard diagnostic questions become queries:

* Span of control and layer count per branch, with the outliers named.
* Capability duplication - the same capability delivered by several units for the same personas.
* Capability gaps - a strategy requiring capabilities no unit delivers, or delivers only at low maturity.
* Role gaps - a person's capabilities against the required capabilities of the roles they hold, in both directions: gap and overqualification.
* Vacancy and key-person risk - vacant roles on critical capabilities; capabilities with exactly one qualified holder.
* Decision bottlenecks - decision rights concentrated on a single role, or operational decisions held at strategic scope.
* Coordination load - cross-unit dependencies with no coordination mechanism, and mechanisms whose cadence does not match the volatility of what they coordinate.
* Fit violations - the whole `FitRule` set, evaluated in CI, with severity and waivers.

### Federation across organizational boundaries

Domains, references, and URI anchors work here as they do in the [product management model](https://product-management.models.nasdanika.org/).
A division publishes its own model as a Maven artifact; the enterprise model references rather than copies it;
a partner publishes the part of its structure the relationship needs.
Merging by URI lets several teams maintain overlapping views of the same unit and have them compose.
Nobody is asked to author into a central registry, which is the reason central org repositories fail.

## Authoring and loading

The model is text in version control, but almost none of it should be typed by hand.

**Draw first.** Org charts get drawn before they get modeled. The [Draw.io model](https://drawio.models.nasdanika.org/) maps shapes to units and roles, edges to reporting lines, and containment to nesting, with markers keeping the trace back to each node. The workshop draws; the model accumulates.

**Spreadsheets are a source, not a rival.** Headcount plans, RACI matrices, and capability assessments are born in Excel, and the Excel model loads them: one row per role or per assignment, columns mapped to unit, grade, capability, and dates.

**Directories and HRIS are the authority for who is where.** Entra ID, Okta, LDAP, SCIM, and HRIS exports load as `Person`s, IAM `Principal`s, group memberships, and reporting lines.
This model does not try to be the system of record for employment.
It references that record and adds everything the record has no place for.

**Prototypes carry what a chart cannot.** A [Groovy DSL](https://docs.nasdanika.org/core/groovy/index.html) prototype supplies charter documentation, decision rights, coordination cadence, delivered capabilities, and default work per unit kind - the "every regulated development team gets four-eyes control on production changes" rule expressed as instance data rather than as a policy PDF.

## Model overview

| Area | Types |
|---|---|
| Root | `Organization` - a domain, merged by URI across federated models |
| Structure | `OrganizationalUnit` (extends product management `CapabilityProvider`, hence threat `Asset` / architecture `Element`), `UnitKind` (instance data: Mintzberg configurations, Team Topologies types) |
| People and roles | `Person` (extends role `Actor`, IAM `Principal`, `CapabilityProvider`), `Role` (extends role `Role`), reporting lines |
| Strategy and environment | `Strategy`, `EnvironmentFactor`, `EnvironmentDimension`, uncertainty and complexity classification |
| Coordination | `CoordinationMechanism`, `CoordinationKind` (instance data: Mintzberg's six mechanisms, Team Topologies interaction modes) |
| Decision rights | `DecisionRight`, `DecisionScope`, `DecisionAuthorityLevel` - over decision binding `VariationPoint`s |
| Fit | `FitRule`, `FitSeverity` - evaluated by the [rules model](https://rules.models.nasdanika.org/) as inspectors producing violations |
| Money | `OrganizationalUnit` contains accounting `Account`s; intended cost series are `Transaction`s carried on relative temporals anchored to org events (exploratory) |
| Reused, not redefined | capability `Capability`, `ProvidedCapability`, `Evidence`; product management `Persona`, `Concern`, `Goal`, `RoleAssignment`; work `Work`; governance `Control`, `Risk`, `Waiver`; lifecycle `Lifecycle`, `Stage`, `Sojourn`; seal `Signature`; IAM `Subject`, `Permission`; architecture `Relationship`, `ElementReference`; accounting `Ledger`, `Account`, `Commodity`, `Transaction`, `Assertion`; nxcore `Temporal`, `Period` |

Four things that were once local classes now come from below, and their absence is deliberate:

* **Capability maturity is a lifecycle.** What was a fixed enum becomes a `Lifecycle` catalog whose `Sojourn`s are dated, attributed, evidenced assessments - the move the [lifecycle model](https://lifecycle.models.nasdanika.org/) describes for exactly this case.
* **Processes and RACI move down.** Process structure belongs to the [process model](https://process.models.nasdanika.org/); responsible, performer, consulted, and informed are `RoleAssignment`s over a period, which is generalized RACI rather than four fixed references.
* **Goals are concerns.** A strategy is a coherent set of product management `Goal`s with a horizon expressed as a `Period`.
* **Unit, coordination, and environment kinds are catalogs.** The metamodel stays small; the vocabularies ship as data.

## What sits on top

**AI Org** extends this model and additionally branches onto [AI governance](https://ai.governance.models.nasdanika.org/), [Maven](https://maven.models.nasdanika.org/), [SOR](https://sor.models.nasdanika.org/), and [Bootstrap](https://bootstrap.ui.models.nasdanika.org/).
The combination is what makes an organization modeled here answerable about its AI estate: which unit owns which `AISystem`, at which risk tier, under which human oversight mode and whose sign-off; which modules, datasets, and systems of record roll up to it; and how all of that renders as a site.

**AI C4 Org** sits on top of AI Org and adds the C4 architecture vocabulary, so a system context, container, and component decomposition shares elements with the org units that own them instead of describing them a second time.

The [internet banking system C4 demo](https://nasdanika-demos.github.io/internet-banking-system-c4/cerulean/index.html) is being refactored onto AI C4 Org, where it becomes the worked example of the whole tower at once: C4 architecture, org ownership and roll-ups, governance and threat aspects on the same elements, and UI modeling for the generated site.
An ESB running Tibco in front of the Mainframe Banking System is being added to demonstrate [BW5](https://bw5.models.nasdanika.org/) scanning, visualization, and analysis against a legacy estate that is described rather than guessed at.

## Resources

* [Sources on GitHub](https://github.com/Nasdanika-Models/org-design)
* [Nasdanika model tower](https://nasdanika.com/models.html)
* [Product management model](https://product-management.models.nasdanika.org/) - the floor directly below
* [Architecture model](https://architecture.models.nasdanika.org/) - the tower ordering and the rules that govern it
* [Maven model](https://maven.models.nasdanika.org/) - the estate side of the ownership coordinate system
* [Accounting model](https://accounting.models.nasdanika.org/) - accounts, commodities, transactions, and assertions; the facts against which projected cost is compared
