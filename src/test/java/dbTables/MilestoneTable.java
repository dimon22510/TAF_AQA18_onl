package dbTables;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import services.DataBaseService;


public class MilestoneTable {
    Logger logger = LogManager.getLogger(MilestoneTable.class);

    private DataBaseService dbService;

    public MilestoneTable(DataBaseService dbService) {
        this.dbService = dbService;
    }


}
