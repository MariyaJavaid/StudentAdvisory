/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myFuzzyProject;






import Model.Big5;
import Model.Needs;
import Model.Values;
import net.sourceforge.jFuzzyLogic.FIS;
import net.sourceforge.jFuzzyLogic.FunctionBlock;
import net.sourceforge.jFuzzyLogic.plot.JFuzzyChart;
import net.sourceforge.jFuzzyLogic.rule.Variable;


public class TestCareer {

	public static String careerEstimate(Big5 traits,Needs traits1,Values traits2) { 
		// Load from 'FCL' file
		String fileName;
            fileName = "C:\\Users\\Administrator\\Desktop\\personality-insights-java-master (1)\\personality-insights-java-master\\src\\com\\myFuzzyProject\\career.fcl";

		FIS fis = FIS.load(fileName, true);
		if (fis == null) { // Error while loading?
			System.err.println("Can't load file: '" + fileName + "'");
			return "-1";
		}

		// Show ruleset
		FunctionBlock functionBlock = fis.getFunctionBlock(null);
		//JFuzzyChart.get().chart(functionBlock);

		// Set inputs
                //Big Five
                
		functionBlock.setVariable("extraversion", traits.getExtraversion()/100);
		functionBlock.setVariable("openness", traits.getOpeness()/100);
                functionBlock.setVariable("emotionalrange", traits.getEmotionalRange()/100);
                functionBlock.setVariable("Conscientiousness", traits.getConscientiousness()/100);
                functionBlock.setVariable("Agreeableness", traits.getAgreeableness()/100);
                
                //Needs
                 functionBlock.setVariable("Challenge", traits1.getChallenge()/100);
                 functionBlock.setVariable("Closeness", traits1.getCloseness()/100);
                 functionBlock.setVariable("Curiosity", traits1.getCuriosity()/100);
                 functionBlock.setVariable("Excitement", traits1.getExcitement()/100);
                 functionBlock.setVariable("Harmony", traits1.getHarmony()/100);  
                 functionBlock.setVariable("Ideal",traits1.getIdeal()/100);
                 functionBlock.setVariable("Liberty", traits1.getLiberty()/100);  
                 functionBlock.setVariable("Love", traits1.getLove()/100);
                 functionBlock.setVariable("Practicality", traits1.getPracticality()/100);
                 functionBlock.setVariable("Selfexpression", traits1.getSelfExpression()/100);
                 functionBlock.setVariable("Stability", traits1.getStability()/100);
                 functionBlock.setVariable("Structure", traits1.getStructure()/100);
                 
                //Values         
               functionBlock.setVariable("Conservation", traits2.getConservation()/100);
                functionBlock.setVariable("Opennesstochange", traits2.getOpennessToChange()/100);
                functionBlock.setVariable("Hedonism", traits2.getHedonism()/100);
                functionBlock.setVariable("Selfenhancement", traits2.getSelfEnhancement()/100);
                functionBlock.setVariable("Selftranscendence", traits2.getSelfTranscendence()/100);

                
               
                       
                
  
                
		// Evaluate 
		functionBlock.evaluate();

		// Show output variable's chart
		Variable career = functionBlock.getVariable("career");
		//JFuzzyChart.get().chart(career, career.getDefuzzifier(), true);
		//Gpr.debug("poor[extraversion]: " + functionBlock.getVariable("extraversion").getMembership("poor"));
                String careertype="";
		// Print ruleSet
		System.out.println(functionBlock);
		System.out.println("career:" + functionBlock.getVariable("career").getValue());
                double value = functionBlock.getVariable("career").getValue();
                 if (value >=0 &&value <=10)
                { 
                    System.out.println("Suggested career is HealthCare And Medical");
                    careertype="healthCare and Medical";
                    
                }
                else if (value >=11 &&value <=20)
                { 
                    System.out.println("Suggested career is Engineering");
                    careertype="Enfineering and Industrial";
                    
                
                }
               else if (value >=21 &&value <=30)
                { 
                    System.out.println("Suggested career is Social Sciences");
                    careertype="Social Science";
                    
                }
                  else if (value >=31 &&value <=40)
                { 
                    System.out.println("Suggested career is Business");
                    careertype="Buisness and Management";
                    
                }
                  else if (value >=41 &&value <=50)
                { 
                    System.out.println("Suggested career is Architecture, Planning & Environmental Design");
                    careertype="Architecture, Planning & Environmental Design";
                    
                } 
                  else if (value >=51 &&value <=60)
                { 
                    System.out.println("Suggested career is Arts, Literature & Entertainment");
                    careertype="Arts, Literature & Entertainment";
                    
                } 
                  else if (value >=61 &&value <=70)
                { 
                    System.out.println("Suggested career is Education");
                    careertype="Eduaction";
                    
                } 
                  else if (value >=71 &&value <=80)
                { 
                    System.out.println("Suggested career is Technology");
                    careertype="Information Technology";
                    
                } 
                  else if (value >=81 &&value <=90)
                { 
                    System.out.println("Suggested career is Sports");
                    careertype="Sports and Recreation";
                    
                } 
                  else if (value >=91 &&value <=100)
                { 
                    System.out.println("Suggested career is Law & Public Policy");
                    careertype="Law & Public Policy";
                    
                } 
                  else if (value >=101 &&value <=110)
                { 
                    System.out.println("Suggested career is Natural Sciences");
                    careertype="Natural Sciences";
                    
                } 
                  else if (value >=111 &&value <=120)
                { 
                    System.out.println("Suggested career is Communications");
                    careertype="Communications";
              
                } 
                  else if (value >=121 &&value <=130)
                { 
                    System.out.println("Suggested career is Government");
                    careertype="Government";
                    
                } 
                
                return careertype;
	

        }
}