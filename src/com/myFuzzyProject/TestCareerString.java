/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myFuzzyProject;

/**
 *
 * @author Mariya
 */



import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;

/**
 * Tests class: Create a simple fuzzy inference system (FIS) form an 'FCL' string
 * @author pcingola@users.sourceforge.net
 */
public class TestCareerString {

	public static void main(String[] args) throws Exception {
		System.out.println("Begin TestCareerString");

		String fcl = "FUNCTION_BLOCK Careers  // Block definition (there may be more than one block per file)\n" + //
				"\n" + //
				"VAR_INPUT              // Define input variables\n" + //
				"   extraversion : REAL;\n" + //
				"   openness : REAL;\n" + //
                        "   emotionalrange : REAL;\n" + //
                        "   Conscientiousness : REAL;\n" + //
                        "   Agreeableness : REAL;\n" + //
                        
				"END_VAR\n" + //
				"\n" + //
				"VAR_OUTPUT             // Define output variable\n" + //
				"   career : REAL;\n" + //
				"END_VAR\n" + //
				"\n" + //
				"FUZZIFY extraversion            // Fuzzify input variable 'extraversion': {'poor', 'good' , 'excellent'}\n" + //
				"   TERM poor := (0, 1) (4, 0) ; \n" + //
				"   TERM good := (1, 0) (4,1) (6,1) (9,0);\n" + //
				"   TERM excellent := (6, 0) (9, 1);\n" + //
				"END_FUZZIFY\n" + //
				"\n" + //
				"FUZZIFY openness           // Fuzzify input variable 'openness': { 'average', 'high' }\n" + //
				"   TERM average := (0, 1) (1, 1) (3,0) ;\n" + //
				"   TERM high := (7,0) (9,1);\n" + //
				"END_FUZZIFY\n" + //
                        
				"\n" + //
                        "FUZZIFY emotionalrange            // Fuzzify input variable 'emotional range': {'poor', 'good' , 'excellent'}\n" + //
				"   TERM poor := (0, 1) (4, 0) ; \n" + //
				"   TERM good := (1, 0) (4,1) (6,1) (9,0);\n" + //
				"   TERM excellent := (6, 0) (9, 1);\n" + //
				"END_FUZZIFY\n" + //
                        	"\n" + //
                         "FUZZIFY Conscientiousness          // Fuzzify input variable 'Conscientiousness': {'poor', 'good' , 'excellent'}\n" + //
				"   TERM poor := (0, 1) (4, 0) ; \n" + //
				"   TERM good := (1, 0) (4,1) (6,1) (9,0);\n" + //
				"   TERM excellent := (6, 0) (9, 1);\n" + //
				"END_FUZZIFY\n" + //
                        	"\n" + //
                        
                          "FUZZIFY Agreeableness           // Fuzzify input variable 'Agreeableness ': {'poor', 'good' , 'excellent'}\n" + //
				"   TERM poor := (0, 1) (4, 0) ; \n" + //
				"   TERM good := (1, 0) (4,1) (6,1) (9,0);\n" + //
				"   TERM excellent := (6, 0) (9, 1);\n" + //
				"END_FUZZIFY\n" + //
                        	"\n" + //
				"DEFUZZIFY career          // Defzzzify output variable 'career' : {'painter', '', 'psychologist' }\n" + //
				"   TERM artist:= (0,0) (5,1) (10,0);\n" + //
				"   TERM painter := (10,0) (15,1) (20,0);\n" + //
				"   TERM psychologist := (20,0) (25,1) (30,0);\n" + //
				"   METHOD : COG;       // Use 'Center Of Gravity' defuzzification method\n" + //
				"   DEFAULT := 0;       // Default value is 0 (if no rule activates defuzzifier)\n" + //
				"END_DEFUZZIFY\n" + //
				"\n" + //
				"RULEBLOCK No1\n" + //
				"   ACCU : MAX;         // Use 'max' accumulation method\n" + //
				"   AND : MIN;          // Use 'min' for 'and' (also implicit use 'max' for 'or' to fulfill DeMorgan's Law)\n" + //
				"   ACT : MIN;          // Use 'min' activation method\n" + //
				"\n" + //
				"RULE 1 : IF extraversion IS poor AND openness IS good AND emotionalrange is good AND Conscientiousness is poor AND Agreeableness is good THEN career IS artist;\n" + //
	 " RULE 2 : IF extraversion IS good AND openness IS good AND emotionalrange is poor AND Conscientiousness is excellent AND Agreeableness is good THEN career IS painter; \n" + //
	" RULE 3 : IF extraversion IS excellent AND openness IS excellent AND emotionalrange is good AND Conscientiousness is poor AND Agreeableness is good  THEN career IS psychologist;\n" + //
				"\n" + //
				"END_RULEBLOCK\n" + //
				"\n" + //
				"END_FUNCTION_BLOCK\n";

		FIS fis = FIS.createFromString(fcl, true);
		FunctionBlock functionBlock = fis.getFunctionBlock("Careers");
		JFuzzyChart.get().chart(functionBlock);

		// Set inputs
		functionBlock.setVariable("extraversion", 0.30);
		functionBlock.setVariable("openness", 0.70);
                functionBlock.setVariable("emotionalrange", 0.60);
                functionBlock.setVariable("Conscientiousness ", 0.50);
                functionBlock.setVariable("Agreeableness", 0.20);

		// Evaluate fuzzy set
		functionBlock.evaluate();

		// Show output variable's chart 
		Variable career = functionBlock.getVariable("career");
		JFuzzyChart.get().chart(career, career.getDefuzzifier(), true);

		// Print ruleSet
		System.out.println(functionBlock);

		System.out.println("End TestCareerString");
	}

	
}
