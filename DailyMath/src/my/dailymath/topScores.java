package my.dailymath;
import java.sql.*;


class topScores {
    public void addScore(String name, int score, String difficulty) {
        String sql = "Insert into Scores (Name, Score, Difficulty) values('" + name + "', " + score + ", '" + difficulty + "')"; 
        Connection connection = null;
        try {
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:sql/scoreList.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.

            statement.executeUpdate(sql);

        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e);
            }
        }

    }
    public void getScores(){
            String sql = "Select * from Scores";
            Connection connection = null;
            try {
                // create a database connection
                connection = DriverManager.getConnection("jdbc:sqlite:sql/scoreList.db");
                Statement statement = connection.createStatement();
                statement.setQueryTimeout(30);  // set timeout to 30 sec.

                ResultSet rs = statement.executeQuery("select * from scores order by score desc limit 10");
                while(rs.next())
                {
                    // read the result set
                    System.out.println("name = " + rs.getString("name"));
                    System.out.println("score = " + rs.getInt("score"));
                    System.out.println("difficulty = " + rs.getString("difficulty"));
                }

            } catch (SQLException e) {
                // if the error message is "out of memory",
                // it probably means no database file is found
                System.err.println(e.getMessage());
            } finally {
                try {
                    if (connection != null)
                        connection.close();
                } catch (SQLException e) {
                    // connection close failed.
                    System.err.println(e);
                }
            }

        }
}

    
