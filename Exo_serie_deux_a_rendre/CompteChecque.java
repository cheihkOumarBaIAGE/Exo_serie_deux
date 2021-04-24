public class CompteChecque extends Compte{
   private int frais;
        
        
        public CompteChecque(){
            super();
        }
    
        public CompteChecque(int solde){
            super(solde);
    
        }

        
    
        public CompteChecque(int solde,int frais){
            super(nomComplet);
            this.frais=frais;
        }
    

        public String getFrais(){
            return frais;
        }
    

        public void setGrade(String tuteur){
            this.grade=grade;
        }
    

        @Override
 
        public void depot(){
            super.depot();
            System.out.println("Frais: "+frais);
        }

        public void retrait(){
            System.out.println("Retrait: "+((super.getSolde*frais)+super.getSolde)"\nNombre de compte: "+nbreCompte+"\nSolde: "+solde);

        }

        public void Virement(){
            System.out.println("Virement: "+((super.getSolde*frais)+super.getSolde)"\nNombre de compte: "+nbreCompte+"\nSolde: "+solde);

        }
    
    }
}