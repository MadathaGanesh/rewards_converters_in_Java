public class RewardValue {
    /*
    . Create a branch for your change.

You'll need to create a RewardValue class, but you shouldn’t modify the main branch directly. Other people use that one too,
 so any change might get in their way. Instead, you’ll create your own Branch,
 which will act as a sort of sandbox you can develop in without stepping on anyone’s toes.
With IntelliJ active, click the terminal tab at the bottom of the screen.
 Repeat after me: git checkout -b reward-value.
This will create a new branch called reward-value. Activate it.
Once you finalize your work, you can merge this branch back into the main.
 Doing so will distribute your changes to other developers working on the same repo.
You can read more about “Git Branching” here.

4. Create a RewardValue class.

Time to make your change - add a new class named RewardValue to the main.java package.
Right-click on a directory in the project tab on the left, then highlight new to create a Java Class.
This class must satisfy the following requirements:
RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
RewardValue must convert from miles to cash at a rate of 0.0035.
    */
   private double cashValue;
    private double MilesValue;
    private static final double Miles_To_Cash_Rate=0.0035;

    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.MilesValue=cashValue/Miles_To_Cash_Rate;
    }

    public RewardValue(double milesValue,boolean isMiles){
        this.MilesValue=milesValue;
        this.cashValue=milesValue+Miles_To_Cash_Rate;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return MilesValue;
    }


}
