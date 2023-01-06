package fr.lille.ippon.challenge.kanban.infrastructure.secondary;

import fr.lille.ippon.challenge.kanban.domain.Task;
import fr.lille.ippon.challenge.kanban.domain.Tasks;

import java.util.List;

class TasksRepository implements Tasks {

    @Override
    public List<Task> getAll() {
        return List.of(new Task("my first task"));
    }
}
