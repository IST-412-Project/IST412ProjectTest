package ist412testproject;


public class Government 
{
    private String decisionMakers;
    private String lawyers;
    private String keyDetails;
    private double dueDateMet;

    public Government(String decisionMakers, String lawyers, String keyDetails, double dueDateMet) {
        this.decisionMakers = decisionMakers;
        this.lawyers = lawyers;
        this.keyDetails = keyDetails;
        this.dueDateMet = dueDateMet;
    }

    public String getDecisionMakers() {
        return decisionMakers;
    }

    public String getLawyers() {
        return lawyers;
    }

    public String getKeyDetails() {
        return keyDetails;
    }

    public double getDueDateMet() {
        return dueDateMet;
    }
    
    

}
