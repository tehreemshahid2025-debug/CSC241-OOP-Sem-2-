class AIExperiment{
      String experimentName;
      int completedEpochs;
      int targetEpochs;
      void runaddEpochs(int epochs){
          completedEpochs+=epochs;
      }
      void runaddEpochs(int epochs, int bonusEpochs){
          completedEpochs+=epochs+bonusEpochs;
      }
       int remainingEpochs(){
          return targetEpochs-completedEpochs;
      }
      String status(){
          String  Summary= "Experiment Name: "+ experimentName +" Targeted Epochs:"+targetEpochs+"Completed Epochs: "+completedEpochs;
           return Summary;
      }      
}