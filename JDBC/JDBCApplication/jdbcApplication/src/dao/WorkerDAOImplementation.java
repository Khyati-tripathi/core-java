package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Worker;
import util.DatabaseConnection;

public class WorkerDAOImplementation implements WorkerDAO {
    Connection cn;

    public WorkerDAOImplementation() throws SQLException {
        cn = DatabaseConnection.getConnection();
    }

    public int add(Worker worker) throws SQLException {

        String insertSql = """
                INSERT INTO Worker (
                    WORKER_ID,
                    FIRST_NAME,
                    LAST_NAME,
                    SALARY,
                    JOINING_DATE,
                    DEPARTMENT,
                    email)
                VALUES
                (?,?,?,?,?,?,? )""";
        PreparedStatement pStatement = cn.prepareStatement(insertSql);
        pStatement.setInt(1, worker.getworkerId());
        pStatement.setString(2, worker.getfirstName());
        pStatement.setString(3, worker.getlastName());
        pStatement.setInt(4, worker.getSalary());
        pStatement.setDate(5, worker.getjoiningDate());
        pStatement.setString(6, worker.getDepartment());
        pStatement.setString(7, worker.getEmail());
        int rowsInserted = pStatement.executeUpdate();
        return rowsInserted;

    }

    public void delete(int workerId) throws SQLException {
        String deleteSql = "DELETE FROM Worker WHERE WORKER_ID = ?";
        PreparedStatement pStatement = cn.prepareStatement(deleteSql);
        pStatement.setInt(1, workerId);
        int r = pStatement.executeUpdate();
        System.out.println(r);

    }

    public Worker getWorker(int workerId) throws SQLException {
        String selectSql = "SELECT * FROM WORKER WHERE WORKER_ID=?";
        PreparedStatement ps = cn.prepareStatement(selectSql);
        ps.setInt(1, workerId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        return new Worker(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5), rs.getString(6),
                rs.getString(7));

    }

    public List<Worker> getWorkers() throws SQLException {
        String query = "SELECT * FROM worker";
        List<Worker> list = new ArrayList<>();
        try (Statement statement = cn.createStatement()) {
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                list.add(new Worker(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
                        rs.getString(6),
                        rs.getString(7)));
            }
            return list;
        }

    }

    public void update(Worker emp) throws SQLException {
        String updateQuery = """
                update worker
                set worker_id=?,
                first_name=?,
                last_name=?,
                salary=?,
                joining_date=?,
                department=?,
                email=?
                where worker_id=?""";

        try (PreparedStatement ps = cn.prepareStatement(updateQuery)) {
            ps.setInt(1, emp.getworkerId());
            ps.setString(2, emp.getfirstName());
            ps.setString(3, emp.getlastName());
            ps.setInt(4, emp.getSalary());
            ps.setDate(5, emp.getjoiningDate());
            ps.setString(6, emp.getDepartment());
            ps.setString(7, emp.getEmail());
            ps.setInt(8, emp.getworkerId());
            int r = ps.executeUpdate();
            System.out.println(r);
        }

    }
}
