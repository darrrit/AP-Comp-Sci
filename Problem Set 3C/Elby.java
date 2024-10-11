public class Elby {
    String statement;
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
    public String getResponse(String _statement) {
        statement = _statement.trim();
        String response = "";
        if (statement.length() == 0) {
            response = "Say something, please.";
        } else if (FKDefault("naomi")) {
            //my prounous are they/them btw :)
            response = "Naomi is such an intelligent person aren't they?";
        } else if (FKDefault("no")) {
            response = "Why so negative?";
        } else if (FKDefault("murder")) {
            response = "I have been programmed on an anti murder agenda... however, have no default stance on suspicious accidents";
        } else if (FKDefault("computer")) {
            response = "Are you just jelous that your aren't as advanced as me?";
        } else if (FKDefault("mother")
        || OWCDefault("father")
        || OWCDefault("sister")
        || OWCDefault("brother")) {
            response = "Tell me more about your family.";
        }
        else if (FKDefault("cat") 
        || OWCDefault("pet")
        || OWCDefault("pets")
        || OWCDefault("dog")){
            response = "Tell me more about your pets.";
        } else {
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
        final int NUMBER_OF_RESPONSES = 9;
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
        } else if (whichResponse == 7) {
            response = "Sorry i didn't catch that";
        } else if (whichResponse == 8) {
            response = "*yawns and stares vacantly through you*";
        }

        return response;
    }

    public int ownWordCheck (String input, String goal) {
        int index = capCheck(input, goal);
        if (index < 0) return -1;
        if (index != 0 && input.charAt(index-1) != ' ') return -1;
        if (goal.length()+index < input.length()) {
            char end = input.charAt(index + goal.length());
            if (end != ' '&& end != '.' && end != '!') return -1;
        } 
        return index;
    }

    public boolean OWCDefault (String goal) {
        int index = capCheck(statement, goal);
        if (index < 0) return false;
        if (index != 0 && statement.charAt(index-1) != ' ') return false;
        if (goal.length()+index < statement.length()) {
            char end = statement.charAt(index + goal.length());
            if (end != ' '&& end != '.' && end != '!') return false;
        } 
        return true;
    }

    public int capCheck(String input, String goal) {
        String lGoal = goal.toLowerCase();
        String lowerInput = input.toLowerCase();
        return lowerInput.indexOf(goal); 
    }

    /**
     * Search for one word in phrase. The search is not case sensitive. This method
     * will check that the given goal is not a substring of a longer string (so,
     * for example, "I know" does not contain "no").
     *
     * @param statement the string to search
     * @param goal the string to search for
     * @param startPos the character of the string to begin the search at
     * @return the index of the first occurrence of goal in statement or -1 if it's
     * 	not found
     */
    
    public boolean FKDefault (String goal) {
        return (findKeyword(statement, goal, 0) >= 0);
    }

    public int findKeyword(String statement, String goal, int startPos) {
        String phrase = statement.trim().toLowerCase();
        goal = goal.toLowerCase();

        // The only change to incorporate the startPos is in the line below
        int goalPos = phrase.indexOf(goal, startPos);

        // Refinement--make sure the goal isn't part of a word
        while (goalPos >= 0) {
            // Find the string of length 1 before and after the word
            String before = " ", after = " ";

            if (goalPos > 0) {
                before = phrase.substring(goalPos - 1, goalPos);
            }

            if (goalPos + goal.length() < phrase.length()) {
                after = phrase.substring(goalPos + goal.length(), 
                    goalPos + goal.length() + 1);
            }

            /* determine the values of goalPos, before, and after at this point */

            // If before and after aren't letters, we've found the word
            if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0)) &&                
            ((after.compareTo("a")  < 0) || (after.compareTo("z")  > 0))) {
                return goalPos;
            }

            // The last position didn't work, so let's find the next, if there is one.
            goalPos = phrase.indexOf(goal,goalPos + 1);
        }
        return -1;
    }

}