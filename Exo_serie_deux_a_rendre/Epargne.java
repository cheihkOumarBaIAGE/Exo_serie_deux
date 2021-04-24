public class Epargne extends Personne{
    private float taux;
        
        //Constructeur
        public Epargne(){
            super();
        }
    
        public Epargne(int numero){
            super(numero);
    
        }
    
        public Etudiant(int numero,float taux){
            super(numero);
            this.taux=taux;
        }
    
        //Getters
        public String getTaux(){
            return taux;
        }
    
        //Setters
        public void setTaux(float taux){
            this.taux=taux;
        }
    
        //Methode Affiche
        //on fait une redefinition
        @Override
        //ça permet de dire que c'est une methode redefinie
        public void affiche(){
            System.out.println("Numero: "+super.getNumero()+"\nTaux: "+taux);
        }
    
    }

}