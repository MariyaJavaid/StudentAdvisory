/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mariya
 */

package com.myFuzzyProject;

import java.util.HashMap;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.Gpr;
import net.sourceforge.jFuzzyLogic.defuzzifier.DefuzzifierCenterOfGravity;
import net.sourceforge.jFuzzyLogic.membership.MembershipFunction;
import net.sourceforge.jFuzzyLogic.membership.MembershipFunctionPieceWiseLinear;
import net.sourceforge.jFuzzyLogic.membership.MembershipFunctionTrapetzoidal;
import net.sourceforge.jFuzzyLogic.membership.MembershipFunctionTriangular;
import net.sourceforge.jFuzzyLogic.membership.Value;
import net.sourceforge.jFuzzyLogic.plot.JDialogFis;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.LinguisticTerm;
import net.sourceforge.jFuzzyLogic.rule.Rule;
import net.sourceforge.jFuzzyLogic.rule.RuleBlock;
import net.sourceforge.jFuzzyLogic.rule.RuleExpression;
import net.sourceforge.jFuzzyLogic.rule.RuleTerm;
import net.sourceforge.jFuzzyLogic.rule.Variable;
import net.sourceforge.jFuzzyLogic.ruleAccumulationMethod.RuleAccumulationMethodMax;
import net.sourceforge.jFuzzyLogic.ruleActivationMethod.RuleActivationMethodMin;
import net.sourceforge.jFuzzyLogic.ruleConnectionMethod.RuleConnectionMethodAndMin;
import net.sourceforge.jFuzzyLogic.ruleConnectionMethod.RuleConnectionMethodOrMax;




public class TestCareerJava
{
	/**
	 * Show animation
	 * @param fis
	 * @throws Exception
	 */
        /*@SuppressWarnings("empty-statement")
	static void animateFis(FIS fis) throws Exception {
		if (JFuzzyChart.UseMockClass) {
			Gpr.debug("Using mock class");
			return; // Nothing done
		}

		

	}*/

	/**
	 * Main
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		System.out.println("Begin TestCareerJava");

		FIS fis = new FIS();

		// FUNCTION_BLOCK careerper
		FunctionBlock functionBlock = new FunctionBlock(fis);
		fis.addFunctionBlock("Careers", functionBlock);

		

		Variable extraversion = new Variable("extraversion");
		Variable openness = new Variable("openness");
                Variable emotionalrange = new Variable("emotionalrange");
                Variable Conscientiousness = new Variable("Conscientiousness");
                Variable Agreeableness= new Variable("Agreeableness");
               //values
                Variable Challenge = new Variable("Challenge"); 
                Variable Closeness = new Variable("Closeness");
                Variable Curiosity= new Variable("Curiosity");
                Variable Excitement= new Variable("Excitement");
                Variable Harmony= new Variable("Harmony"); 
                Variable Ideal= new Variable("Ideal"); 
                Variable Liberty = new Variable("Liberty");
                Variable Love = new Variable("Love");
                Variable Practicality= new Variable("Practicality");
                Variable Selfexpression= new Variable("Selfexpression");
                Variable Stability= new Variable("Stability");
                Variable Structure= new Variable("Structure");
                //needs
                Variable Conservation= new Variable("Conservation");
                Variable Opennesstochange= new Variable("Openesstochange");
                Variable Hedonism= new Variable("Hedonism");
                Variable Selfenhancement= new Variable("Selfenhancement");
                Variable Selftranscendence= new Variable("Selftranscendence");
                                    
                 
                                    
                 
                 
              
                
		functionBlock.setVariable(extraversion.getName(), extraversion);
		functionBlock.setVariable(openness.getName(), openness);
                functionBlock.setVariable(emotionalrange.getName(), emotionalrange);
                functionBlock.setVariable(Conscientiousness.getName(), Conscientiousness);
                functionBlock.setVariable(Agreeableness.getName(), Agreeableness);
                functionBlock.setVariable(Challenge.getName(), Challenge);
                functionBlock.setVariable(Closeness.getName(), Closeness); 
                functionBlock.setVariable(Excitement.getName(), Excitement);
                functionBlock.setVariable(Harmony.getName(),  Harmony);
                functionBlock.setVariable(Ideal.getName(),Ideal);                 
                functionBlock.setVariable(Liberty.getName(), Liberty);
                functionBlock.setVariable(Love.getName(), Love);
                functionBlock.setVariable(Practicality.getName(), Practicality);               
                functionBlock.setVariable(Curiosity.getName(),Curiosity);
                functionBlock.setVariable(Selfexpression.getName(), Selfexpression); 
                functionBlock.setVariable(Stability.getName(), Stability); 
                functionBlock.setVariable(Structure.getName(), Structure);
                functionBlock.setVariable(Conservation.getName(), Conservation);  
                functionBlock.setVariable(Opennesstochange.getName(), Opennesstochange);
                functionBlock.setVariable(Hedonism.getName(), Hedonism);
                functionBlock.setVariable(Selfenhancement.getName(), Selfenhancement);
                functionBlock.setVariable(Selftranscendence.getName(), Selftranscendence);
                         

	

		Variable career = new Variable("career");
		functionBlock.setVariable(career.getName(), career);

			

		Value poorX[] = { new Value(0.1), new Value(0.40) };
		Value poorY[] = { new Value(0.10), new Value(0.10) };
		MembershipFunction poor = new MembershipFunctionPieceWiseLinear(poorX, poorY);
                
                MembershipFunction good = new MembershipFunctionTrapetzoidal(new Value(0.40), new Value(0.50), new Value(0.60), new Value(0.70));

	

		Value exX[] = { new Value(0.70), new Value(0.80) };
		Value exY[] = { new Value(0.80), new Value(1) };
		MembershipFunction excellent = new MembershipFunctionPieceWiseLinear(exX, exY);

		LinguisticTerm ltPoor = new LinguisticTerm("poor", poor);
		LinguisticTerm ltGood = new LinguisticTerm("good", good);
		LinguisticTerm ltExcellent = new LinguisticTerm("excellent", excellent);

		extraversion.add(ltPoor);
		extraversion.add(ltGood);
		extraversion.add(ltExcellent);
                
                
                //openness
                
               
		openness.add(ltPoor);
		openness.add(ltGood);
		openness.add(ltExcellent);
                
                //emotionalrange
                emotionalrange.add(ltPoor);
		emotionalrange.add(ltGood);
		emotionalrange.add(ltExcellent);
                
                //Conscientiousness
                
                 Conscientiousness.add(ltPoor);
		Conscientiousness.add(ltGood);
		Conscientiousness.add(ltExcellent);
               
                //Agreeableness
                Agreeableness.add(ltPoor);
		Agreeableness.add(ltGood);
		Agreeableness.add(ltExcellent);
                
                //Challenge
                Challenge.add(ltPoor);
		Challenge.add(ltGood);
		Challenge.add(ltExcellent);
                
                //Closeness 
                Closeness.add(ltPoor);
		Closeness.add(ltGood);
		Closeness.add(ltExcellent);
                
                 //Curiosity
                Curiosity.add(ltPoor);
                Curiosity.add(ltGood);
		Curiosity.add(ltExcellent);
                
                //Excitement
                Excitement.add(ltPoor);
		Excitement.add(ltGood);
		Excitement.add(ltExcellent);
                   
                //Harmony
                Harmony.add(ltPoor);
                Harmony.add(ltGood);
		Harmony.add(ltExcellent);
                
                
                //Ideal 
                Ideal.add(ltPoor);
		Ideal.add(ltGood);
		Ideal.add(ltExcellent);
                
                //Liberty
                Liberty.add(ltPoor);
		Liberty.add(ltGood);
		Liberty.add(ltExcellent);
                
                //Love
                Love.add(ltPoor);
		Love.add(ltGood);
		Love.add(ltExcellent);
                
                //Practicality
                Practicality.add(ltPoor);
                Practicality.add(ltGood);
                Practicality.add(ltExcellent);
               
                           
                 // Selfexpression
                Selfexpression.add(ltPoor);
                Selfexpression.add(ltGood);
                Selfexpression.add(ltExcellent);
                 
                 //Stability 
                 Stability.add(ltPoor);
                 Stability.add(ltGood);
                 Stability.add(ltExcellent);

                 //Structure 
                 Structure.add(ltPoor);
                 Structure.add(ltGood);
                 Structure.add(ltExcellent);

                 //Conservation 
                 Conservation.add(ltPoor);
                 Conservation.add(ltGood);
                 Conservation.add(ltExcellent);
          
 
                 //Opennesstochange  
                 Opennesstochange.add(ltPoor);
                 Opennesstochange.add(ltGood);
                 Opennesstochange.add(ltExcellent);
                 
                 //Hedonism  
                 Hedonism.add(ltPoor);
                 Hedonism.add(ltGood);
                 Hedonism.add(ltExcellent);
                 
                //Selfenhancement  
                 Selfenhancement.add(ltPoor);
                 Selfenhancement.add(ltGood);
                 Selfenhancement.add(ltExcellent);
                
                
                //Selftranscendence 
                Selftranscendence.add(ltPoor);
                Selftranscendence.add(ltGood);
                Selftranscendence.add(ltExcellent);
             
                

                
                //MembershipFunction
                
		MembershipFunction HealthcareAndMedical = new MembershipFunctionTriangular(new Value(1), new Value(5), new Value(10));
		MembershipFunction Engineering = new MembershipFunctionTriangular(new Value(10), new Value(15), new Value(20));
		MembershipFunction SocialSciences = new MembershipFunctionTriangular(new Value(21), new Value(25), new Value(30));
                MembershipFunction business = new MembershipFunctionTriangular(new Value(31), new Value(35), new Value(40));
                MembershipFunction ArchitecturePlanningEnvironmentalDesign = new MembershipFunctionTriangular(new Value(41), new Value(45), new Value(50));
                MembershipFunction ArtsLiteratureEntertainment = new MembershipFunctionTriangular(new Value(51), new Value(55), new Value(60));
                MembershipFunction Education = new MembershipFunctionTriangular(new Value(61), new Value(65), new Value(70));
                MembershipFunction Technology = new MembershipFunctionTriangular(new Value(71), new Value(75), new Value(80));
                MembershipFunction Sports = new MembershipFunctionTriangular(new Value(81), new Value(85), new Value(90));
                MembershipFunction LawPublicPolicy = new MembershipFunctionTriangular(new Value(91), new Value(95), new Value(100));
                MembershipFunction NaturalSciences = new MembershipFunctionTriangular(new Value(101), new Value(105), new Value(110));
                MembershipFunction Communications = new MembershipFunctionTriangular(new Value(111), new Value(115), new Value(120));
                MembershipFunction Government= new MembershipFunctionTriangular(new Value(121), new Value(125), new Value(130));
               
		LinguisticTerm ltHealthcareAndMedical = new LinguisticTerm("HealthcareAndMedical",HealthcareAndMedical );
		LinguisticTerm ltEngineering  = new LinguisticTerm("Engineering",Engineering );
		LinguisticTerm ltSocialSciences = new LinguisticTerm("SocialSciences", SocialSciences);
                LinguisticTerm ltbusiness = new LinguisticTerm("business", business);
                LinguisticTerm ltArchitecturePlanningEnvironmentalDesign = new LinguisticTerm("ArchitecturePlanningEnvironmentalDesign", ArchitecturePlanningEnvironmentalDesign); 
                LinguisticTerm ltArtsLiteratureEntertainment = new LinguisticTerm("ArtsLiteratureEntertainment", ArtsLiteratureEntertainment);
                LinguisticTerm ltEducation = new LinguisticTerm("Education", Education);
                LinguisticTerm ltTechnology = new LinguisticTerm("Technology", Technology);
                LinguisticTerm ltSports = new LinguisticTerm("Sports", Sports);
                LinguisticTerm ltLawPublicPolicy = new LinguisticTerm("LawPublicPolicy",LawPublicPolicy);
                LinguisticTerm ltNaturalSciences = new LinguisticTerm("NaturalSciences",NaturalSciences);
                LinguisticTerm ltCommunications = new LinguisticTerm("Communications", Communications);
                LinguisticTerm ltGovernment = new LinguisticTerm("Government", Government);
		career.add(ltHealthcareAndMedical);
		career.add(ltEngineering);
		career.add(ltSocialSciences);
                career.add(ltbusiness);
                career.add(ltArchitecturePlanningEnvironmentalDesign);
                career.add(ltArtsLiteratureEntertainment);
                career.add(ltEducation);
                career.add(ltTechnology);
                career.add(ltSports);
                career.add(ltLawPublicPolicy);
                career.add(ltNaturalSciences);
                career.add(ltCommunications);
                career.add(ltGovernment);
		career.setDefuzzifier(new DefuzzifierCenterOfGravity(career));

		//		RULEBLOCK No1
		//		   ACCU : MAX;
		//		   AND : MIN;
		//		   ACT : MIN;
		RuleBlock ruleBlock = new RuleBlock(functionBlock);
		ruleBlock.setName("No1");
		ruleBlock.setRuleAccumulationMethod(new RuleAccumulationMethodMax());
		ruleBlock.setRuleActivationMethod(new RuleActivationMethodMin());
                
                /* 	RULE 1 :IF extraversion IS good AND openness IS excellent 
                AND emotionalrange is poor AND Conscientiousness is excellent AND 
                Agreeableness is excellent AND Challenge is excellent AND Closeness is good AND 
                Curiosity is excellent AND Excitement is good AND Harmony is excellent AND Ideal is good
                AND Liberty is good AND Love is good AND Practicality is excellent AND Selfexpression is good AND 
                Stability  is excellent AND Structure is excellent AND Conservation is good AND Opennesstochange is good
                AND Hedonism is good AND Selfenhancement is excellent AND Selftranscendence is excellent THEN career IS HealthcareAndMedical;
 */
		
                Rule rule1 = new Rule("Rule1", ruleBlock);
		RuleTerm term1 = new RuleTerm(extraversion, "good", false);
		RuleTerm term2 = new RuleTerm(openness, "excellent", false);
                RuleTerm term3 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term4 = new RuleTerm(Conscientiousness, "excellent", false);
                RuleTerm term5 = new RuleTerm(Agreeableness, "excellent", false);
                RuleTerm term6 = new RuleTerm(Challenge, "excellent", false);
                RuleTerm term7 = new RuleTerm(Closeness, "good", false);
                RuleTerm term8 = new RuleTerm(Curiosity, "excellent", false); 
                RuleTerm term9 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term10 = new RuleTerm(Harmony, "excellent", false);
                RuleTerm term11 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term12 = new RuleTerm(Liberty, "good", false);
                RuleTerm term13 = new RuleTerm(Love, "good", false);
                RuleTerm term14 = new RuleTerm(Practicality, "excellent", false);  
                RuleTerm term15 = new RuleTerm(Selfexpression, "good", false);
                RuleTerm term16 = new RuleTerm(Stability, "excellent", false);
                RuleTerm term17 = new RuleTerm(Structure , "excellent", false);
                RuleTerm term18 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term19 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term20 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term21 = new RuleTerm(Selfenhancement, "excellent", false);
                RuleTerm term22 = new RuleTerm(Selftranscendence, "excellent", false);
                                
                                          
                    
                      
                    
               
                RuleExpression antecedentAnd = new RuleExpression(term1, term2, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd1 = new RuleExpression(antecedentAnd , term3, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd2 = new RuleExpression(antecedentAnd1 , term4, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd3 = new RuleExpression(antecedentAnd2 , term5, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd4 = new RuleExpression(antecedentAnd3 , term6, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd5 = new RuleExpression(antecedentAnd4 , term7, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd6 = new RuleExpression(antecedentAnd5 , term8, RuleConnectionMethodAndMin.get());                              
                RuleExpression antecedentAnd7 = new RuleExpression(antecedentAnd6 , term9, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd8 = new RuleExpression(antecedentAnd7 , term10, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd9 = new RuleExpression(antecedentAnd8 , term11, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd10 = new RuleExpression(antecedentAnd9 , term12, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd11 = new RuleExpression(antecedentAnd10 , term13, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd12 = new RuleExpression(antecedentAnd11 , term14, RuleConnectionMethodAndMin.get());
		RuleExpression antecedentAnd13 = new RuleExpression(antecedentAnd12 , term15, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd14 = new RuleExpression(antecedentAnd13 , term16, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd15 = new RuleExpression(antecedentAnd14 , term17, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd16 = new RuleExpression(antecedentAnd15 , term18, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd17 = new RuleExpression(antecedentAnd16 , term19, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd18 = new RuleExpression(antecedentAnd17 , term20, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd19 = new RuleExpression(antecedentAnd18 , term21, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd20 = new RuleExpression(antecedentAnd19 , term22, RuleConnectionMethodAndMin.get());
              
                
                rule1.setAntecedents(antecedentAnd20); // Set antecedent

		rule1.addConsequent(career, "HealthcareAndMedical", false);
		ruleBlock.add(rule1);

                /*	RULE 2 :IF extraversion IS good AND openness IS excellent AND emotionalrange is poor 
                        AND Conscientiousness is excellent AND Agreeableness is good 
                        AND Challenge is excellent AND Closeness is excellent AND Curiosity is excellent 
                        AND Excitement is excellent AND Harmony is good AND Ideal is good AND Liberty is excellent 
                       AND Love is good AND Practicality is excellent AND Selfexpression is excellent AND 
                       Stability  is good AND Structure is excellent AND Conservation is poor AND 
                       Opennesstochange is excellent AND Hedonism is good AND Selfenhancement is excellent AND Selftranscendence is good THEN career IS Engineering;
 */
		
		 Rule rule2 = new Rule("Rule2", ruleBlock);
		RuleTerm term23 = new RuleTerm(extraversion, "good", false);
		RuleTerm term24 = new RuleTerm(openness, "excellent", false);
                RuleTerm term25 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term26 = new RuleTerm(Conscientiousness, "excellent", false);
                RuleTerm term27 = new RuleTerm(Agreeableness, "good", false);
                RuleTerm term28 = new RuleTerm(Challenge, "excellent", false);
                RuleTerm term29 = new RuleTerm(Closeness, "excellent", false);
                RuleTerm term30 = new RuleTerm(Curiosity, "excellent", false); 
                RuleTerm term31 = new RuleTerm(Excitement, "excellent", false); 
                RuleTerm term32 = new RuleTerm(Harmony, "good", false);
                RuleTerm term33 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term34 = new RuleTerm(Liberty, "excellent", false);
                RuleTerm term35 = new RuleTerm(Love, "good", false);
                RuleTerm term36 = new RuleTerm(Practicality, "excellent", false);  
                RuleTerm term37 = new RuleTerm(Selfexpression, "excellent", false);
                RuleTerm term38 = new RuleTerm(Stability, "good", false);
                RuleTerm term39 = new RuleTerm(Structure , "excellent", false);
                RuleTerm term40 = new RuleTerm(Conservation, "good", false);
                RuleTerm term41 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term42 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term43 = new RuleTerm(Selfenhancement, "excellent", false);
                RuleTerm term44 = new RuleTerm(Selftranscendence, "good", false);
          
             
                RuleExpression antecedentAnd21 = new RuleExpression(term23, term24, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd22 = new RuleExpression(antecedentAnd21 , term25, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd23 = new RuleExpression(antecedentAnd22, term26, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd24 = new RuleExpression(antecedentAnd23, term27, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd25 = new RuleExpression(antecedentAnd24 , term28, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd26 = new RuleExpression(antecedentAnd25, term29, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd27 = new RuleExpression(antecedentAnd26 , term30, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd28 = new RuleExpression(antecedentAnd27 , term31, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd29 = new RuleExpression(antecedentAnd28 , term32, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd30= new RuleExpression(antecedentAnd29 , term33, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd31 = new RuleExpression(antecedentAnd30 , term34, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd32 = new RuleExpression(antecedentAnd31 , term35, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd33 = new RuleExpression(antecedentAnd32 , term36, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd34 = new RuleExpression(antecedentAnd33 , term37, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd35 = new RuleExpression(antecedentAnd34 , term38, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd36 = new RuleExpression(antecedentAnd35 , term39, RuleConnectionMethodAndMin.get());  
                 RuleExpression antecedentAnd37 = new RuleExpression(antecedentAnd36 , term40, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd38 = new RuleExpression(antecedentAnd37 , term41, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd39 = new RuleExpression(antecedentAnd38 , term42, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd40 = new RuleExpression(antecedentAnd39 , term43, RuleConnectionMethodAndMin.get());
                 RuleExpression antecedentAnd41 = new RuleExpression(antecedentAnd40 , term44, RuleConnectionMethodAndMin.get());
                     
		rule2.setAntecedents(antecedentAnd41); // Set antecedent

		rule2.addConsequent(career, "Engineering", false);
		ruleBlock.add(rule2);

		/*IF extraversion IS poor  AND openness IS good AND emotionalrange is poor
                 AND Conscientiousness is poor AND Agreeableness is good AND Challenge is excellent
                 AND Closeness is good AND Curiosity is good Excitement is good AND Harmony is good 
                 AND Ideal is good AND Liberty is good AND Love is good AND Practicality is excellent
                 AND Selfexpression is excellent AND Stability  is good AND Structure is excellent AND
                 Conservation is poor AND Opennesstochange is excellent AND Hedonism is good AND Selfenhancement
                 is good AND Selftranscendence is good THEN career IS SocialSciences; */
                
              
                Rule rule3 = new Rule("Rule3", ruleBlock);
		RuleTerm term45 = new RuleTerm(extraversion, "poor", false);
		RuleTerm term46 = new RuleTerm(openness, "good", false);
                RuleTerm term47 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term49 = new RuleTerm(Conscientiousness, "poor", false);
                RuleTerm term50 = new RuleTerm(Agreeableness, "good", false);
                RuleTerm term51 = new RuleTerm(Challenge, "excellent", false);
                RuleTerm term52 = new RuleTerm(Closeness, "good", false);
                RuleTerm term53 = new RuleTerm(Curiosity, "good", false); 
                RuleTerm term54 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term55 = new RuleTerm(Harmony, "good", false);
                RuleTerm term56 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term57 = new RuleTerm(Liberty, "good", false);
                RuleTerm term58 = new RuleTerm(Love, "good", false);
                RuleTerm term59 = new RuleTerm(Practicality, "excellent", false);  
                RuleTerm term60 = new RuleTerm(Selfexpression, "excellent", false);
                RuleTerm term61 = new RuleTerm(Stability, "good", false);
                RuleTerm term62 = new RuleTerm(Structure , "excellent", false);
                RuleTerm term63 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term64 = new RuleTerm(Opennesstochange, "excellent", false);
                RuleTerm term65 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term66 = new RuleTerm(Selfenhancement, "good", false);
                RuleTerm term67 = new RuleTerm(Selftranscendence, "good", false);
             
                    
                RuleExpression antecedentAnd42 = new RuleExpression(term45, term46, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd43 = new RuleExpression(antecedentAnd42 , term47, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd44 = new RuleExpression(antecedentAnd43 , term49, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd45 = new RuleExpression(antecedentAnd44 , term50, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd46 = new RuleExpression(antecedentAnd45 , term51, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd47 = new RuleExpression(antecedentAnd46 , term52, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd48 = new RuleExpression(antecedentAnd47 , term53, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd49 = new RuleExpression(antecedentAnd48 , term54, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd50 = new RuleExpression(antecedentAnd49 , term55, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd51= new RuleExpression(antecedentAnd50,  term56, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd52 = new RuleExpression(antecedentAnd51 , term57, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd53 = new RuleExpression(antecedentAnd52 , term58, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd54 = new RuleExpression(antecedentAnd53 , term59, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd55 = new RuleExpression(antecedentAnd54 , term60, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd56 = new RuleExpression(antecedentAnd55 , term61, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd57 = new RuleExpression(antecedentAnd56 , term62, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd58 = new RuleExpression(antecedentAnd57 , term63, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd59 = new RuleExpression(antecedentAnd58 , term64, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd60 = new RuleExpression(antecedentAnd59 , term65, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd61 = new RuleExpression(antecedentAnd60 , term66, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd62 = new RuleExpression(antecedentAnd61 , term67, RuleConnectionMethodAndMin.get());
                
		rule3.setAntecedents(antecedentAnd62); // Set antecedent

		rule3.addConsequent(career, "SocialSciences", false);
		ruleBlock.add(rule3);
               
                
               /*        RULE 4 :IF extraversion IS good AND openness IS  good AND emotionalrange is poor AND Conscientiousness is excellent 
                         AND Agreeableness is good AND Challenge is excellent AND Closeness is poor AND Curiosity is excellent AND 
                        Excitement is good AND Harmony is excellent AND Ideal is good AND Liberty is good AND 
                        Love is excellent AND Practicality is good AND Selfexpression is good AND Stability is excellent
                        AND Structure is excellent AND Conservation is good AND Opennesstochange is good AND Hedonism is 
                        good AND Selfenhancement is excellent AND Selftranscendence is excellent THEN career IS business ;
 ;  */
               
                Rule rule4 = new Rule("Rule4", ruleBlock);
		RuleTerm term68 = new RuleTerm(extraversion, "good", false);
		RuleTerm term69 = new RuleTerm(openness, "good", false);
                RuleTerm term70 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term71 = new RuleTerm(Conscientiousness, "excellent", false);
                RuleTerm term72 = new RuleTerm(Agreeableness, "good", false);
                RuleTerm term73 = new RuleTerm(Challenge, "excellent", false);
                RuleTerm term74 = new RuleTerm(Closeness, "poor", false);
                RuleTerm term75 = new RuleTerm(Curiosity, "excellent", false); 
                RuleTerm term76 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term77 = new RuleTerm(Harmony, "excellent", false);
                RuleTerm term78 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term79 = new RuleTerm(Liberty, "good", false);
                RuleTerm term80 = new RuleTerm(Love, "excellent", false);
                RuleTerm term81 = new RuleTerm(Practicality, "good", false);  
                RuleTerm term82 = new RuleTerm(Selfexpression, "good", false);
                RuleTerm term83 = new RuleTerm(Stability, "excellent", false);
                RuleTerm term84 = new RuleTerm(Structure , "excellent", false);
                RuleTerm term85 = new RuleTerm(Conservation, "good", false);
                RuleTerm term86 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term87 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term88 = new RuleTerm(Selfenhancement, "excellent", false);
                RuleTerm term89 = new RuleTerm(Selftranscendence, "excellent", false);
          
             
                    
                RuleExpression antecedentAnd63 = new RuleExpression(term68, term69, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd64 = new RuleExpression(antecedentAnd63 , term70, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd65 = new RuleExpression(antecedentAnd64 , term71, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd66 = new RuleExpression(antecedentAnd65 , term72, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd67 = new RuleExpression(antecedentAnd66 , term73, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd68 = new RuleExpression(antecedentAnd67 , term74, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd69 = new RuleExpression(antecedentAnd68 , term75, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd70 = new RuleExpression(antecedentAnd69 , term76, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd71 = new RuleExpression(antecedentAnd70 , term77, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd72= new RuleExpression(antecedentAnd71,   term78, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd73 = new RuleExpression(antecedentAnd72 , term79, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd74 = new RuleExpression(antecedentAnd73 , term80, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd75 = new RuleExpression(antecedentAnd74 , term81, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd76 = new RuleExpression(antecedentAnd75 , term82, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd77 = new RuleExpression(antecedentAnd76 , term83, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd78 = new RuleExpression(antecedentAnd77 , term84, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd79 = new RuleExpression(antecedentAnd78 , term85, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd80 = new RuleExpression(antecedentAnd79 , term86, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd81 = new RuleExpression(antecedentAnd80 , term87, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd82 = new RuleExpression(antecedentAnd81 , term88, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd83 = new RuleExpression(antecedentAnd82 , term89, RuleConnectionMethodAndMin.get());
		rule4.setAntecedents(antecedentAnd83); // Set antecedent

		rule4.addConsequent(career, "business", false);
		ruleBlock.add(rule4);
                   
                   /* RULE 5 :IF extraversion IS good AND openness IS  good AND emotionalrange is good 
                AND Conscientiousness is excellent AND Agreeableness is excellent AND Challenge is good
                AND Closeness is excellent AND Curiosity is excellent AND Excitement is good AND
                Harmony is good AND Ideal is good AND Liberty is excellent AND Love is poor AND 
                Practicality is excellent AND Selfexpression is excellent AND Stability is excellent
                AND Structure is excellent AND Conservation is good AND Opennesstochange is good AND 
                Hedonism is good AND Selfenhancement is poor AND Selftranscendence is good THEN career IS ArchitecturePlanningEnvironmentalDesign ;
   */
                Rule rule5 = new Rule("Rule5", ruleBlock);
		RuleTerm term90 = new RuleTerm(extraversion, "good", false);
		RuleTerm term91 = new RuleTerm(openness, "good", false);
                RuleTerm term92 = new RuleTerm(emotionalrange, "good", false);
                RuleTerm term93 = new RuleTerm(Conscientiousness, "excellent", false);
                RuleTerm term94 = new RuleTerm(Agreeableness, "excellent", false);
                RuleTerm term95 = new RuleTerm(Challenge, "good", false);
                RuleTerm term96 = new RuleTerm(Closeness, "excellent", false);
                RuleTerm term97 = new RuleTerm(Curiosity, "excellent", false); 
                RuleTerm term98 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term99 = new RuleTerm(Harmony, "good", false);
                RuleTerm term100 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term101 = new RuleTerm(Liberty, "excellent", false);
                RuleTerm term102 = new RuleTerm(Love, "poor", false);
                RuleTerm term103 = new RuleTerm(Practicality, "excellent", false);  
                RuleTerm term104 = new RuleTerm(Selfexpression, "excellent", false);
                RuleTerm term105 = new RuleTerm(Stability, "excellent", false);
                RuleTerm term106 = new RuleTerm(Structure , "excellent", false);
                RuleTerm term107 = new RuleTerm(Conservation, "good", false);
                RuleTerm term108 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term109 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term110 = new RuleTerm(Selfenhancement, "poor", false);
                RuleTerm term111 = new RuleTerm(Selftranscendence, "good", false);
          
             
                    
                RuleExpression antecedentAnd84 = new RuleExpression(term90, term91, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd85 = new RuleExpression(antecedentAnd84 , term92, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd86 = new RuleExpression(antecedentAnd85 , term93, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd87 = new RuleExpression(antecedentAnd86 , term94, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd88 = new RuleExpression(antecedentAnd87 , term95, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd89 = new RuleExpression(antecedentAnd88 , term96, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd90 = new RuleExpression(antecedentAnd89 , term97, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd91 = new RuleExpression(antecedentAnd90 , term98, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd92 = new RuleExpression(antecedentAnd91 , term99, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd93= new RuleExpression(antecedentAnd92,   term100, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd94 = new RuleExpression(antecedentAnd93 , term101, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd95 = new RuleExpression(antecedentAnd94 , term102, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd96 = new RuleExpression(antecedentAnd95 , term103, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd97 = new RuleExpression(antecedentAnd96 , term104, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd98 = new RuleExpression(antecedentAnd97 , term105, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd99 = new RuleExpression(antecedentAnd98 , term106, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd100 = new RuleExpression(antecedentAnd99 , term107, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd101 = new RuleExpression(antecedentAnd100 , term108, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd102 = new RuleExpression(antecedentAnd101 , term109, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd103 = new RuleExpression(antecedentAnd102 , term110, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd104 = new RuleExpression(antecedentAnd103 , term111, RuleConnectionMethodAndMin.get());
		rule5.setAntecedents(antecedentAnd104); // Set antecedent

		rule5.addConsequent(career, "ArchitecturePlanningEnvironmentalDesign", false);
		ruleBlock.add(rule5);
              /*          RULE 6 :IF extraversion IS good AND openness IS  good AND emotionalrange is good 
                AND Conscientiousness is excellent AND Agreeableness is excellent AND Challenge is excellent 
                AND Closeness is good AND Curiosity is excellent AND Excitement is excellent AND Harmony is
                excellent AND Ideal is good AND Liberty is excellent AND Love is excellent AND Practicality is
                excellent AND Selfexpression is excellent AND Stability is excellent AND Structure is good AND 
                Conservation is poor AND Opennesstochange is excellent AND Hedonism is excellent
                AND Selfenhancement is excellent AND Selftranscendence is excellent THEN career IS ArtsLiteratureEntertainment ;

                */
                Rule rule6 = new Rule("Rule6", ruleBlock);
		RuleTerm term112 = new RuleTerm(extraversion, "good", false);
		RuleTerm term113 = new RuleTerm(openness, "good", false);
                RuleTerm term114 = new RuleTerm(emotionalrange, "good", false);
                RuleTerm term115 = new RuleTerm(Conscientiousness, "excellent", false);
                RuleTerm term116 = new RuleTerm(Agreeableness, "excellent", false);
                RuleTerm term117 = new RuleTerm(Challenge, "excellent", false);
                RuleTerm term118 = new RuleTerm(Closeness, "good", false);
                RuleTerm term119 = new RuleTerm(Curiosity, "excellent", false); 
                RuleTerm term120 = new RuleTerm(Excitement, "excellent", false); 
                RuleTerm term121 = new RuleTerm(Harmony, "excellent", false);
                RuleTerm term122 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term123 = new RuleTerm(Liberty, "excellent", false);
                RuleTerm term124 = new RuleTerm(Love, "excellent", false);
                RuleTerm term125 = new RuleTerm(Practicality, "excellent", false);  
                RuleTerm term126 = new RuleTerm(Selfexpression, "excellent", false);
                RuleTerm term127 = new RuleTerm(Stability, "excellent", false);
                RuleTerm term128 = new RuleTerm(Structure , "good", false);
                RuleTerm term129 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term130 = new RuleTerm(Opennesstochange, "excellent", false);
                RuleTerm term131 = new RuleTerm(Hedonism, "excellent", false);
                RuleTerm term132 = new RuleTerm(Selfenhancement, "excellent", false);
                RuleTerm term133 = new RuleTerm(Selftranscendence, "excellent", false);
          
             
                    
                RuleExpression antecedentAnd105 = new RuleExpression(term112, term113, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd106 = new RuleExpression(antecedentAnd105 , term114, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd107 = new RuleExpression(antecedentAnd106 , term115, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd108 = new RuleExpression(antecedentAnd107 , term116, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd109 = new RuleExpression(antecedentAnd108 , term117, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd110 = new RuleExpression(antecedentAnd109 , term118, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd111 = new RuleExpression(antecedentAnd110 , term119, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd112 = new RuleExpression(antecedentAnd111 , term120, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd113 = new RuleExpression(antecedentAnd112 , term121, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd114= new RuleExpression(antecedentAnd113,   term122, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd115 = new RuleExpression(antecedentAnd114 , term123, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd116 = new RuleExpression(antecedentAnd115 , term124, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd117 = new RuleExpression(antecedentAnd116 , term125, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd118 = new RuleExpression(antecedentAnd117 , term126, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd119 = new RuleExpression(antecedentAnd118 , term127, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd120 = new RuleExpression(antecedentAnd119 , term128, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd121 = new RuleExpression(antecedentAnd120 , term129, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd122 = new RuleExpression(antecedentAnd121 , term130, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd123 = new RuleExpression(antecedentAnd122 , term131, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd124 = new RuleExpression(antecedentAnd123 , term132, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd125 = new RuleExpression(antecedentAnd124 , term133, RuleConnectionMethodAndMin.get());
		rule6.setAntecedents(antecedentAnd125); // Set antecedent

		rule6.addConsequent(career, "ArtsLiteratureEntertainment", false);
		ruleBlock.add(rule6);
                /*        RULE 7 :IF extraversion IS good AND openness IS  excellent AND emotionalrange is good AND
                Conscientiousness is good AND Agreeableness is excellent AND Challenge is excellent AND Closeness is good
                AND Curiosity is excellent AND Excitement is good AND Harmony is excellent AND Ideal is good AND Liberty 
                is good AND Love is good AND Practicality is excellent AND Selfexpression is excellent AND Stability
                is good AND Structure is good AND Conservation is good AND Opennesstochange is good AND 
                Hedonism is poor AND Selfenhancement is excellent AND Selftranscendence is excellent THEN career IS Education ;

                */
                Rule rule7 = new Rule("Rule7", ruleBlock);
		RuleTerm term134 = new RuleTerm(extraversion, "excellent", false);
		RuleTerm term135 = new RuleTerm(openness, "excellent", false);
                RuleTerm term136 = new RuleTerm(emotionalrange, "good", false);
                RuleTerm term137 = new RuleTerm(Conscientiousness, "good", false);
                RuleTerm term138 = new RuleTerm(Agreeableness, "excellent", false);
                RuleTerm term139 = new RuleTerm(Challenge, "excellent", false);
                RuleTerm term140 = new RuleTerm(Closeness, "good", false);
                RuleTerm term141 = new RuleTerm(Curiosity, "excellent", false); 
                RuleTerm term142 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term143 = new RuleTerm(Harmony, "excellent", false);
                RuleTerm term144 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term145 = new RuleTerm(Liberty, "good", false);
                RuleTerm term146 = new RuleTerm(Love, "good", false);
                RuleTerm term147 = new RuleTerm(Practicality, "excellent", false);  
                RuleTerm term148 = new RuleTerm(Selfexpression, "excellent", false);
                RuleTerm term149 = new RuleTerm(Stability, "good", false);
                RuleTerm term150 = new RuleTerm(Structure , "good", false);
                RuleTerm term151 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term152 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term153 = new RuleTerm(Hedonism, "poor", false);
                RuleTerm term154 = new RuleTerm(Selfenhancement, "excellent", false);
                RuleTerm term155 = new RuleTerm(Selftranscendence, "excellent", false);
          
             
                    
                RuleExpression antecedentAnd126 = new RuleExpression(term134, term135, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd127 = new RuleExpression(antecedentAnd126 , term136, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd128 = new RuleExpression(antecedentAnd127 , term137, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd129 = new RuleExpression(antecedentAnd128 , term138, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd130 = new RuleExpression(antecedentAnd129 , term139, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd131 = new RuleExpression(antecedentAnd130 , term140, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd132 = new RuleExpression(antecedentAnd131 , term141, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd133 = new RuleExpression(antecedentAnd132 , term142, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd134 = new RuleExpression(antecedentAnd133 , term143, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd135= new RuleExpression(antecedentAnd134,   term144, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd137 = new RuleExpression(antecedentAnd135 , term145, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd138 = new RuleExpression(antecedentAnd137 , term146, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd139 = new RuleExpression(antecedentAnd138 , term147, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd140 = new RuleExpression(antecedentAnd139 , term148, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd141 = new RuleExpression(antecedentAnd140 , term149, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd142 = new RuleExpression(antecedentAnd141 , term150, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd143 = new RuleExpression(antecedentAnd142 , term151, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd144 = new RuleExpression(antecedentAnd143 , term152, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd145 = new RuleExpression(antecedentAnd144 , term153, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd146 = new RuleExpression(antecedentAnd145 , term154, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd147 = new RuleExpression(antecedentAnd146 , term155, RuleConnectionMethodAndMin.get());
		rule7.setAntecedents(antecedentAnd147); // Set antecedent

		rule7.addConsequent(career, "Education", false);
		ruleBlock.add(rule7);
                /*
                        RULE 8 :IF extraversion IS good AND openness IS  excellent AND emotionalrange is good AND Conscientiousness is 
                excellent AND Agreeableness is good AND Challenge is excellent AND Closeness is good AND
                Curiosity is excellent AND Excitement is excellent AND Harmony is good AND Ideal is good AND
                Liberty is good AND Love is good AND Practicality is excellent AND Selfexpression is excellent 
                AND Stability is good AND Structure is excellent AND Conservation is poor AND
                Opennesstochange is excellent AND Hedonism is poor AND Selfenhancement is excellent 
                AND Selftranscendence is good THEN career IS Technology ;

                */
                Rule rule8 = new Rule("Rule8", ruleBlock);
		RuleTerm term156 = new RuleTerm(extraversion, "good", false);
		RuleTerm term157 = new RuleTerm(openness, "excellent", false);
                RuleTerm term158 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term159 = new RuleTerm(Conscientiousness, "excellent", false);
                RuleTerm term160 = new RuleTerm(Agreeableness, "good", false);
                RuleTerm term161= new RuleTerm(Challenge, "excellent", false);
                RuleTerm term162 = new RuleTerm(Closeness, "good", false);
                RuleTerm term163 = new RuleTerm(Curiosity, "excellent", false); 
                RuleTerm term164 = new RuleTerm(Excitement, "excellent", false); 
                RuleTerm term165 = new RuleTerm(Harmony, "good", false);
                RuleTerm term166 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term167 = new RuleTerm(Liberty, "good", false);
                RuleTerm term168 = new RuleTerm(Love, "good", false);
                RuleTerm term169 = new RuleTerm(Practicality, "excellent", false);  
                RuleTerm term170 = new RuleTerm(Selfexpression, "excellent", false);
                RuleTerm term171 = new RuleTerm(Stability, "good", false);
                RuleTerm term172 = new RuleTerm(Structure , "excellent", false);
                RuleTerm term173 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term174 = new RuleTerm(Opennesstochange, "excellent", false);
                RuleTerm term175 = new RuleTerm(Hedonism, "poor", false);
                RuleTerm term176 = new RuleTerm(Selfenhancement, "excellent", false);
                RuleTerm term177 = new RuleTerm(Selftranscendence, "good", false);
          
             
                    
                RuleExpression antecedentAnd148 = new RuleExpression(term156, term157, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd149 = new RuleExpression(antecedentAnd148 , term158, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd150 = new RuleExpression(antecedentAnd149 , term159, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd151 = new RuleExpression(antecedentAnd150 , term160, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd152 = new RuleExpression(antecedentAnd151 , term161, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd153 = new RuleExpression(antecedentAnd152 , term162, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd154 = new RuleExpression(antecedentAnd153 , term163, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd155 = new RuleExpression(antecedentAnd154 , term164, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd156 = new RuleExpression(antecedentAnd155 , term165, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd157= new RuleExpression(antecedentAnd156,   term166, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd158 = new RuleExpression(antecedentAnd157 , term167, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd159 = new RuleExpression(antecedentAnd158 , term168, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd160 = new RuleExpression(antecedentAnd159 , term169, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd161 = new RuleExpression(antecedentAnd160 , term170, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd162 = new RuleExpression(antecedentAnd161 , term171, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd163 = new RuleExpression(antecedentAnd162 , term172, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd164 = new RuleExpression(antecedentAnd163 , term173, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd165 = new RuleExpression(antecedentAnd164 , term174, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd166 = new RuleExpression(antecedentAnd165 , term175, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd167 = new RuleExpression(antecedentAnd166 , term176, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd168 = new RuleExpression(antecedentAnd167 , term177, RuleConnectionMethodAndMin.get());
		rule8.setAntecedents(antecedentAnd168); // Set antecedent

		rule8.addConsequent(career, "Technology", false);
		ruleBlock.add(rule8);
                
                
                
                	
                
                Rule rule9 = new Rule("Rule9", ruleBlock);
		RuleTerm term178 = new RuleTerm(extraversion, "good", false);
		RuleTerm term179 = new RuleTerm(openness, "excellent", false);
                RuleTerm term180 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term181 = new RuleTerm(Conscientiousness, "good", false);
                RuleTerm term182 = new RuleTerm(Agreeableness, "good", false);
                RuleTerm term183= new RuleTerm(Challenge, "excellent", false);
                RuleTerm term184 = new RuleTerm(Closeness, "good", false);
                RuleTerm term185 = new RuleTerm(Curiosity, "good", false); 
                RuleTerm term186 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term187 = new RuleTerm(Harmony, "good", false);
                RuleTerm term188 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term189 = new RuleTerm(Liberty, "good", false);
                RuleTerm term190 = new RuleTerm(Love, "good", false);
                RuleTerm term191 = new RuleTerm(Practicality, "good", false);  
                RuleTerm term192 = new RuleTerm(Selfexpression, "good", false);
                RuleTerm term193 = new RuleTerm(Stability, "good", false);
                RuleTerm term194 = new RuleTerm(Structure , "good", false);
                RuleTerm term195 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term196 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term197 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term198 = new RuleTerm(Selfenhancement, "good", false);
                RuleTerm term199 = new RuleTerm(Selftranscendence, "good", false);
          
             
                    
                RuleExpression antecedentAnd169 = new RuleExpression(term178, term179, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd170 = new RuleExpression(antecedentAnd169 , term180, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd171 = new RuleExpression(antecedentAnd170 , term181, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd172 = new RuleExpression(antecedentAnd171 , term182, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd173 = new RuleExpression(antecedentAnd172 , term183, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd174 = new RuleExpression(antecedentAnd173 , term184, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd175 = new RuleExpression(antecedentAnd174 , term185, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd176 = new RuleExpression(antecedentAnd175 , term186, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd177 = new RuleExpression(antecedentAnd176 , term187, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd178= new RuleExpression(antecedentAnd177,   term188, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd179 = new RuleExpression(antecedentAnd178 , term189, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd180 = new RuleExpression(antecedentAnd179 , term190, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd181 = new RuleExpression(antecedentAnd180 , term191, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd182 = new RuleExpression(antecedentAnd181 , term192, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd183 = new RuleExpression(antecedentAnd182 , term193, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd184 = new RuleExpression(antecedentAnd183 , term194, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd185 = new RuleExpression(antecedentAnd184 , term195, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd186 = new RuleExpression(antecedentAnd185 , term196, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd187 = new RuleExpression(antecedentAnd186 , term197, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd188 = new RuleExpression(antecedentAnd187 , term198, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd189 = new RuleExpression(antecedentAnd188 , term199, RuleConnectionMethodAndMin.get());
		rule9.setAntecedents(antecedentAnd189); // Set antecedent

		rule9.addConsequent(career, "Sports", false);
		ruleBlock.add(rule9);
                
                
                
                
/*                        RULE 10 :IF extraversion IS excellent AND openness IS  good AND
                emotionalrange is good AND Conscientiousness is excellent AND Agreeableness is poor 
                AND Challenge is excellent AND Closeness is good AND Curiosity is excellent AND Excitement is good
                AND Harmony is excellent AND Ideal is good AND Liberty is excellent AND Love is good AND
                Practicality is excellent AND Selfexpression is excellent AND Stability is excellent AND
                Structure is good AND Conservation is good AND Opennesstochange is excellent AND 
                Hedonism is excellent AND Selfenhancement is excellent AND Selftranscendence is excellent THEN career IS LawPublicPolicy ;
*/
                Rule rule10 = new Rule("Rule10", ruleBlock);
		RuleTerm term200 = new RuleTerm(extraversion, "excellent", false);
		RuleTerm term201 = new RuleTerm(openness, "good", false);
                RuleTerm term202 = new RuleTerm(emotionalrange, "good", false);
                RuleTerm term203 = new RuleTerm(Conscientiousness, "excellent", false);
                RuleTerm term204 = new RuleTerm(Agreeableness, "poor", false);
                RuleTerm term205= new RuleTerm(Challenge, "excellent", false);
                RuleTerm term206 = new RuleTerm(Closeness, "good", false);
                RuleTerm term207 = new RuleTerm(Curiosity, "excellent", false); 
                RuleTerm term208 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term209 = new RuleTerm(Harmony, "excellent", false);
                RuleTerm term210 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term211 = new RuleTerm(Liberty, "excellent", false);
                RuleTerm term212 = new RuleTerm(Love, "good", false);
                RuleTerm term213 = new RuleTerm(Practicality, "excellent", false);  
                RuleTerm term214 = new RuleTerm(Selfexpression, "excellent", false);
                RuleTerm term215 = new RuleTerm(Stability, "excellent", false);
                RuleTerm term216 = new RuleTerm(Structure , "good", false);
                RuleTerm term217 = new RuleTerm(Conservation, "good", false);
                RuleTerm term218 = new RuleTerm(Opennesstochange, "excellent", false);
                RuleTerm term219 = new RuleTerm(Hedonism, "excellent", false);
                RuleTerm term220 = new RuleTerm(Selfenhancement, "excellent", false);
                RuleTerm term221 = new RuleTerm(Selftranscendence, "excellent", false);
          
             
                    
                RuleExpression antecedentAnd190 = new RuleExpression(term200, term201, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd191 = new RuleExpression(antecedentAnd190 , term202, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd192 = new RuleExpression(antecedentAnd191 , term203, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd193 = new RuleExpression(antecedentAnd192 , term204, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd194 = new RuleExpression(antecedentAnd193 , term205, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd195 = new RuleExpression(antecedentAnd194 , term206, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd196 = new RuleExpression(antecedentAnd195 , term207, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd197 = new RuleExpression(antecedentAnd196 , term208, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd198 = new RuleExpression(antecedentAnd197 , term209, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd199= new RuleExpression(antecedentAnd198,   term210, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd200 = new RuleExpression(antecedentAnd199 , term211, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd201 = new RuleExpression(antecedentAnd200 , term212, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd202 = new RuleExpression(antecedentAnd201 , term213, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd203 = new RuleExpression(antecedentAnd202 , term214, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd204 = new RuleExpression(antecedentAnd203 , term215, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd205 = new RuleExpression(antecedentAnd204 , term216, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd206 = new RuleExpression(antecedentAnd205 , term217, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd207 = new RuleExpression(antecedentAnd206 , term218, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd208 = new RuleExpression(antecedentAnd207 , term219, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd209 = new RuleExpression(antecedentAnd208 , term220, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd210 = new RuleExpression(antecedentAnd209 , term221, RuleConnectionMethodAndMin.get());
		rule10.setAntecedents(antecedentAnd210);// Set antecedent

		rule10.addConsequent(career, "LawPublicPolicy", false);
		ruleBlock.add(rule10);
                	
                
                Rule rule11 = new Rule("Rule11", ruleBlock);
		RuleTerm term222 = new RuleTerm(extraversion, "good", false);
		RuleTerm term223 = new RuleTerm(openness, "excellent", false);
                RuleTerm term224 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term225 = new RuleTerm(Conscientiousness, "good", false);
                RuleTerm term226 = new RuleTerm(Agreeableness, "good", false);
                RuleTerm term227= new RuleTerm(Challenge, "excellent", false);
                RuleTerm term228 = new RuleTerm(Closeness, "good", false);
                RuleTerm term229 = new RuleTerm(Curiosity, "good", false); 
                RuleTerm term230 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term231 = new RuleTerm(Harmony, "good", false);
                RuleTerm term232 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term233 = new RuleTerm(Liberty, "good", false);
                RuleTerm term234 = new RuleTerm(Love, "good", false);
                RuleTerm term235 = new RuleTerm(Practicality, "good", false);  
                RuleTerm term236 = new RuleTerm(Selfexpression, "good", false);
                RuleTerm term237 = new RuleTerm(Stability, "good", false);
                RuleTerm term238 = new RuleTerm(Structure , "good", false);
                RuleTerm term239 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term240 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term241 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term242 = new RuleTerm(Selfenhancement, "good", false);
                RuleTerm term243 = new RuleTerm(Selftranscendence, "good", false);
          
             
                    
                RuleExpression antecedentAnd211 = new RuleExpression(term222, term223, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd212 = new RuleExpression(antecedentAnd211 , term224, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd213 = new RuleExpression(antecedentAnd212 , term225, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd214 = new RuleExpression(antecedentAnd213 , term226, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd215 = new RuleExpression(antecedentAnd214 , term227, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd216 = new RuleExpression(antecedentAnd215 , term228, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd217 = new RuleExpression(antecedentAnd216 , term229, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd218 = new RuleExpression(antecedentAnd217 , term230, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd219 = new RuleExpression(antecedentAnd218 , term231, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd220= new RuleExpression(antecedentAnd219,   term232, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd221 = new RuleExpression(antecedentAnd220 , term233, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd222 = new RuleExpression(antecedentAnd221 , term234, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd223 = new RuleExpression(antecedentAnd222 , term235, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd224 = new RuleExpression(antecedentAnd223 , term236, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd225 = new RuleExpression(antecedentAnd224 , term237, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd226 = new RuleExpression(antecedentAnd225 , term238, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd227 = new RuleExpression(antecedentAnd226 , term239, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd228 = new RuleExpression(antecedentAnd227 , term240, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd229 = new RuleExpression(antecedentAnd228 , term241, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd230 = new RuleExpression(antecedentAnd229 , term242, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd231 = new RuleExpression(antecedentAnd230 , term243, RuleConnectionMethodAndMin.get());
		rule4.setAntecedents(antecedentAnd231); // Set antecedent

		rule11.addConsequent(career, "NaturalSciences", false);
		ruleBlock.add(rule11);
                
                
                	
                
                Rule rule12 = new Rule("Rule12", ruleBlock);
		RuleTerm term244 = new RuleTerm(extraversion, "good", false);
		RuleTerm term245 = new RuleTerm(openness, "excellent", false);
                RuleTerm term246 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term247 = new RuleTerm(Conscientiousness, "good", false);
                RuleTerm term248 = new RuleTerm(Agreeableness, "good", false);
                RuleTerm term249= new RuleTerm(Challenge, "excellent", false);
                RuleTerm term250 = new RuleTerm(Closeness, "good", false);
                RuleTerm term251 = new RuleTerm(Curiosity, "good", false); 
                RuleTerm term252 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term253 = new RuleTerm(Harmony, "good", false);
                RuleTerm term254 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term255 = new RuleTerm(Liberty, "good", false);
                RuleTerm term256 = new RuleTerm(Love, "good", false);
                RuleTerm term257 = new RuleTerm(Practicality, "good", false);  
                RuleTerm term258 = new RuleTerm(Selfexpression, "good", false);
                RuleTerm term259 = new RuleTerm(Stability, "good", false);
                RuleTerm term260 = new RuleTerm(Structure , "good", false);
                RuleTerm term261 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term262 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term263 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term264 = new RuleTerm(Selfenhancement, "good", false);
                RuleTerm term265 = new RuleTerm(Selftranscendence, "good", false);
          
             
                    
                RuleExpression antecedentAnd232 = new RuleExpression(term244, term245, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd233 = new RuleExpression(antecedentAnd232 , term246, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd234 = new RuleExpression(antecedentAnd233 , term247, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd235 = new RuleExpression(antecedentAnd234 , term248, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd236 = new RuleExpression(antecedentAnd235 , term249, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd237 = new RuleExpression(antecedentAnd236 , term250, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd238 = new RuleExpression(antecedentAnd237 , term251, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd240 = new RuleExpression(antecedentAnd238 , term252, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd241 = new RuleExpression(antecedentAnd240 , term253, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd242= new RuleExpression(antecedentAnd241,   term254, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd243 = new RuleExpression(antecedentAnd242 , term255, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd244 = new RuleExpression(antecedentAnd243 , term256, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd245 = new RuleExpression(antecedentAnd244 , term257, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd246 = new RuleExpression(antecedentAnd245 , term258, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd247 = new RuleExpression(antecedentAnd246 , term259, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd248 = new RuleExpression(antecedentAnd247 , term260, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd249 = new RuleExpression(antecedentAnd248 , term261, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd250 = new RuleExpression(antecedentAnd249 , term262, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd251 = new RuleExpression(antecedentAnd250 , term263, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd252 = new RuleExpression(antecedentAnd251 , term264, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd253 = new RuleExpression(antecedentAnd252 , term265, RuleConnectionMethodAndMin.get());
		rule4.setAntecedents(antecedentAnd253); // Set antecedent

		rule12.addConsequent(career, "Communications", false);
		ruleBlock.add(rule12);
                
                
                
                Rule rule13 = new Rule("Rule13", ruleBlock);
		RuleTerm term266 = new RuleTerm(extraversion, "good", false);
		RuleTerm term267 = new RuleTerm(openness, "excellent", false);
                RuleTerm term268 = new RuleTerm(emotionalrange, "poor", false);
                RuleTerm term269 = new RuleTerm(Conscientiousness, "good", false);
                RuleTerm term270 = new RuleTerm(Agreeableness, "good", false);
                RuleTerm term271= new RuleTerm(Challenge, "excellent", false);
                RuleTerm term272 = new RuleTerm(Closeness, "good", false);
                RuleTerm term273 = new RuleTerm(Curiosity, "good", false); 
                RuleTerm term274 = new RuleTerm(Excitement, "good", false); 
                RuleTerm term275 = new RuleTerm(Harmony, "good", false);
                RuleTerm term276 = new RuleTerm(Ideal, "good", false);  
                RuleTerm term277 = new RuleTerm(Liberty, "good", false);
                RuleTerm term278 = new RuleTerm(Love, "good", false);
                RuleTerm term279 = new RuleTerm(Practicality, "good", false);  
                RuleTerm term280 = new RuleTerm(Selfexpression, "good", false);
                RuleTerm term281 = new RuleTerm(Stability, "good", false);
                RuleTerm term282 = new RuleTerm(Structure , "good", false);
                RuleTerm term283 = new RuleTerm(Conservation, "poor", false);
                RuleTerm term284 = new RuleTerm(Opennesstochange, "good", false);
                RuleTerm term285 = new RuleTerm(Hedonism, "good", false);
                RuleTerm term286 = new RuleTerm(Selfenhancement, "good", false);
                RuleTerm term287 = new RuleTerm(Selftranscendence, "good", false);
          
             
                    
                RuleExpression antecedentAnd254 = new RuleExpression(term266, term267, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd255 = new RuleExpression(antecedentAnd254 , term268, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd256 = new RuleExpression(antecedentAnd255 , term269, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd257 = new RuleExpression(antecedentAnd256 , term270, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd258 = new RuleExpression(antecedentAnd257 , term271, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd259 = new RuleExpression(antecedentAnd258 , term272, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd260 = new RuleExpression(antecedentAnd259 , term273, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd261 = new RuleExpression(antecedentAnd260 , term274, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd262 = new RuleExpression(antecedentAnd261 , term275, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd263= new RuleExpression(antecedentAnd262,   term276, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd264 = new RuleExpression(antecedentAnd263 , term277, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd265 = new RuleExpression(antecedentAnd263 , term278, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd266 = new RuleExpression(antecedentAnd265 , term279, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd267 = new RuleExpression(antecedentAnd266 , term280, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd268 = new RuleExpression(antecedentAnd267 , term281, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd269 = new RuleExpression(antecedentAnd268 , term282, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd270 = new RuleExpression(antecedentAnd269 , term283, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd271 = new RuleExpression(antecedentAnd270 , term284, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd272 = new RuleExpression(antecedentAnd271 , term285, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd273 = new RuleExpression(antecedentAnd272 , term286, RuleConnectionMethodAndMin.get());
                RuleExpression antecedentAnd274 = new RuleExpression(antecedentAnd273 , term287, RuleConnectionMethodAndMin.get());
		rule13.setAntecedents(antecedentAnd274); // Set antecedent

		rule13.addConsequent(career, "Government", false);
		ruleBlock.add(rule13);
                
		//		END_RULEBLOCK
		//
		//		END_FUNCTION_BLOCK
		HashMap<String, RuleBlock> ruleBlocksMap = new HashMap<>();
		ruleBlocksMap.put(ruleBlock.getName(), ruleBlock);
		functionBlock.setRuleBlocks(ruleBlocksMap);

		//---
		// Show generated FIS (FCL) and show animation
		//---
		//System.out.println(fis);
		//animateFis(fis);
                

		System.out.println("End TestCareerJava");
	}

	
}
