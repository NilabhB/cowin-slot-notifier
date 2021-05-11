Design problem
---
Design a system which notifies a user upon finding a valid Covid slot.

### Requirements
#### Functional Requirements
1. Any user should be able to initiate the slot booking operation which should be asynchronous
2. The system should be able to connect with cowin api to find relevant slot details.
3. The system should expose REST Api for other services to use this functionality.
4. Code should be modular and readable.
5. The notification service should be extensible, we should be able to select the type of notification at runtime.
6. The system should have a polling mechanism to be able to query cowin api.
7. The system should have a mechanism to decide the threshold number of slots before notifying the user.

#### Non-Functional Requirements
1. The system should be fault-tolerant. If an ip gets blocked or blacklisted via cowin, we should be able to spin up a new system
