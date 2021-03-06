package com.appspot.eyllamafoundation.gamify;

public class Term {

    private String term, definition;

    public Term(String term, String definition) {
        this.term = term;
        this.definition = definition;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public String getTerm() {
        return term;
    }

    public String getDefinition() {
        return definition;
    }

    public String toString() {
        return "-" + term + ": " + definition;
    }
}
