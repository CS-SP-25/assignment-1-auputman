public class SalesTaxCalculator {
    public static void main(String[] args) {
        State state = null; //declare State, leave it as null for now

        if (args[0].equals("Indiana")) { //If the argument is that this is Indiana
            state = new Indiana(new SevenPercent()); //set the state to Indiana with seven percent tax
        } else if (args[0].equals("Alaska")) { //If the argument is that this is Alaska
            state = new Alaska(new NoTax()); //set state to Alaska with no tax
	} else if (args[0].equals("Hawaii")) {
            state = new Hawaii(new FourHalfPercent()); //set state to Hawaii with 4.5 percent tax
        } else { //For other states
            throw new IllegalArgumentException("That state isn't Alaska, Hawaii or Indiana"); //yell at the user
        }

        state.showTax(Double.parseDouble(args[1])); //print the tax
    }
}
