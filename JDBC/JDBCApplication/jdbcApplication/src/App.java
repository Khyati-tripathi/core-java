import dao.WorkerDAO;
import dao.WorkerDAOImplementation;
import model.Worker;
import util.DatabaseConnection;

import java.sql.*;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Worker obj = new Worker(11, "khyati", "tripathi", 50000, Date.valueOf("2022-03-21"), "new",
                "k.tripathi@mail.in");
        WorkerDAO workerDao = new WorkerDAOImplementation();
        // System.out.println(workerDao.add(obj));
        // workerDao.delete(22);
        System.out.println(workerDao.getWorker(1));
        workerDao.getWorkers();
        List<Worker> list = workerDao.getWorkers();
        for (Worker workers : list) {
            System.out.println(workers);
        }
        Worker emp = new Worker(10, "new", "user", 50000, Date.valueOf("2022-03-21"), "new", "n.user@mail.in");
        workerDao.update(emp);
        DatabaseConnection.closeConnection();
    }
}
