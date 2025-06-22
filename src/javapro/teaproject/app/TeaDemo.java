package javapro.teaproject.app;

import basicjava.homeworkpractice.repository.TaskRepository;
import basicjava.homeworkpractice.service.TaskService;
import javapro.teaproject.UI.UI;
import javapro.teaproject.repository.TeaRepository;
import javapro.teaproject.service.TeaService;

public class TeaDemo {
    public static void main(String[] args) {
        TeaRepository teaRepository = new TeaRepository();
        TeaService teaService = new TeaService(teaRepository);
        UI ui = new UI(teaService);
        ui.startProgramm();
    }
}
