import uuid
from typing import Optional

class Person:
    def __init__(
        self,
        name: str,
        central_id: uuid.UUID,
        tenant_id: uuid.UUID,
        group_id: uuid.UUID,
        capacity: int,
        funcional: str
    ):
        self.name = name
        self.central_id = central_id
        self.tenant_id = tenant_id
        self.group_id = group_id
        self.capacity = capacity
        self.funcional = funcional

    def __repr__(self):
        return (f"Person(name={self.name!r}, central_id={self.central_id}, "
                f"tenant_id={self.tenant_id}, group_id={self.group_id}, "
                f"capacity={self.capacity}, funcional={self.funcional!r})")