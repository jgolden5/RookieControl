# Rookie Control: Document-searching made easy
_May we always remember that things are better than they used to be_
# Game Plan
## Phase 0 — Framing (Before Any Code)

**Goal:** Align scope and expectations

1. Write a **one-page concept doc**

   * What problem it solves
   * What it does *and does not* do
   * Who the user is
2. List **core use cases**

   * Search by document code
   * View metadata
   * Download PDF / Word
3. Share this with your manager (optional but powerful)

   * Ask for feedback, not approval

*Skills touched:* communication, problem solving

---

## Phase 1 — System Design (Still No Code)

**Goal:** Remove ambiguity before implementation

4. Draw a **simple architecture diagram**

   * Browser → REST API → SQL DB → File storage
5. Design the **data model**

   * Document
   * Version
   * File
6. Write the **API contract**

   * Endpoints
   * Inputs
   * Outputs
   * Error cases

Lock this in before coding.

*Skills touched:* REST, SQL, documentation

---

## Phase 2 — Project Setup & Git Discipline

**Goal:** Professional foundation

7. Create repos

   * `doc-search-backend`
   * `doc-search-frontend`
8. Initialize git

   * `main` branch protected
   * Feature branches only
9. Write initial README

   * How to run locally

*Skills touched:* git, documentation

---

## Phase 3 — Backend Skeleton (Java)

**Goal:** Working API with no frontend yet

10. Scaffold Spring Boot app
11. Add health endpoint

* `/health`

12. Set up database connection
13. Create empty controllers, services, repositories
14. Add basic error handling

At this point:
✔ App runs
✔ API responds

*Skills touched:* Java, REST, problem solving

---

## Phase 4 — SQL & Search Logic

**Goal:** Core functionality works

15. Implement database schema
16. Seed test data
17. Implement:

* `GET /documents?code=...`

18. Validate document code format
19. Add indexes for search performance

Now you can search documents via API.

*Skills touched:* SQL, REST, Java

---

## Phase 5 — Metadata & File Access

**Goal:** Complete backend capabilities

20. Add metadata endpoint
21. Add file download endpoint
22. Handle:

* Missing files
* Wrong formats
* Permission errors

23. Write backend tests

Backend is now “feature complete.”

*Skills touched:* problem solving, Java, REST

---

## Phase 6 — Frontend (Keep It Boring)

**Goal:** Stable, predictable UI

24. Build basic HTML layout
25. Add search input
26. Fetch from API
27. Display:

* Results
* Metadata
* File links

28. Add clear error states

No frameworks needed unless you want them.

*Skills touched:* JS (ES6+), HTML, CSS

---

## Phase 7 — Hardening & Polish

**Goal:** Fix what usually breaks apps

29. Handle edge cases

* Partial matches
* Network failures
* Large files

30. Improve UX clarity
31. Add logging

This is where you surpass the existing app.

*Skills touched:* problem solving, UX

---

## Phase 8 — CI/CD

**Goal:** Make it repeatable

32. Add GitHub Actions

* Backend build + tests
* Frontend lint

33. Optional deployment

* Internal demo only

*Skills touched:* CI/CD

---

## Phase 9 — Agile Artifacts

**Goal:** Make your work legible to others

34. Organize issues into sprints
35. Write short sprint summaries
36. Retro: what worked, what didn’t

*Skills touched:* Agile / Scrum

---

## Phase 10 — Documentation & Storytelling

**Goal:** Turn work into career leverage

37. Finalize docs
38. Write:

* “Why the old app likely failed”
* “Why this architecture is simpler”

39. Prepare a demo walkthrough

*Skills touched:* documentation, communication
