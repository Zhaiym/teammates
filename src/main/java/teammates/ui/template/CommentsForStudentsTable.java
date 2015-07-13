package teammates.ui.template;

import java.util.List;

/**
 * Each table contains comments given to students by a giver with a specific
 * email and course ID. Comments by the same giver email but different course IDs
 * e.g same instructor in different courses will be in different tables.
 */
public class CommentsForStudentsTable {
    private String giverDetails;
    private List<Comment> rows;
    
    public CommentsForStudentsTable(String giverDetails, List<Comment> rows) {
        this.giverDetails = giverDetails;
        this.rows = rows;
    }
    
    public String getGiverDetails() {
        return giverDetails;
    }
    
    public List<Comment> getRows() {
        return rows;
    }
}
