package dbTables;


import models.Project;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.DataBaseService;

import java.sql.ResultSet;

public class ProjectTable {

    Logger logger = LogManager.getLogger(ProjectTable.class);

    private DataBaseService dbService;

    public ProjectTable(DataBaseService dbService) {
        this.dbService = dbService;
    }

    public void createTable() {
        logger.info("Создаём Project таблицу");

        String createTableSQL = "" +
                "create table public.projects " +
                "(id SERIAL PRIMARY KEY," +
                "    name CHARACTER VARYING(30)," +
                "    announcement CHARACTER VARYING(30)," +
                "    show_announcement BOOLEAN," +
                "    suite_mode INTEGER" +
                ");";

        dbService.executeSQL(createTableSQL);
    }

    public void dropTable() {
        logger.info("Удаляем Project таблицу");

        String dropTableSQL = "drop table if exists public.projects;";

        dbService.executeSQL(dropTableSQL);
    }

    public ResultSet getProject() {
        String sql = "SELECT * FROM public.projects;";

        return dbService.executeQuery(sql);
    }

    public void addProject(Project project) {
        String insertTableSQL = "INSERT INTO public.projects(" +
                "id, name, announcement, show_announcement, suite_mode)" +
                "VALUES ('" + project.getId() + "', '" + project.getName() + "', '" + project.getAnnouncement() +
                "', '" + project.isShowAnnouncement() + "', " + project.getType() + ");";

        dbService.executeSQL(insertTableSQL);
    }

    public void deleteProject(int id) {

    }
}
