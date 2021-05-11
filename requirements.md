Design problem
---
Design a system which notifies a user upon finding a valid Covid slot.

### Requirements
1. Any user should be able to initiate the slot booking operation which should be asynchronous
2. The system should be able to connect with cowin api to find relevant slot details.
3. The system should expose REST Api for other services to use this functionality.
4. Code should be modular and readable
5. The notification service should be extensible, we should be able to select the type of notification at runtime.
