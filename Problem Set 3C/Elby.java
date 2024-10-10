public class Elby {
    /**
     * Get a default greeting
     *
     * @return a greeting
     */
    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";

        if (ownWordCheck(statement, "no") >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
        || statement.indexOf("father") >= 0
        || statement.indexOf("sister") >= 0
        || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        }
        else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     *
     * @return a non-committal string
     */
    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 7;
        double r = Math.random();
        int whichResponse = (int) (r * NUMBER_OF_RESPONSES);

        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "To be honest, i'm not interested in that topic.";
        } else if (whichResponse == 5) {
            response = "Well you know what they say about opinions... everyone has one.";
        } else if (whichResponse == 6) {
            response = "Okay?..";
        }

        return response;
    }

    public int ownWordCheck (String statement, String goal) {
        int index = capCheck(statement, goal);
        char indexm1 = 'n';
        char indexp1 =  'n';
        if (index >= 0) {
            if (index > 0) indexp1 = statement.charAt(index+1);
            if (goal.length() + index < statement.length()) {
                indexm1 = statement.charAt(index-1);
                if (indexp1 != ' ' && indexp1 != '.' || indexp1 != '!') index = -1;
            }       
            if (indexm1 != ' ' && indexm1 != 'n') index = -1;
        }
        return index;
    }

    public int capCheck(String statement, String goal) {
        String lGoal = goal.toLowerCase();
        String lStatement = statement.toLowerCase();
        return lStatement.indexOf(goal); 
    }
}