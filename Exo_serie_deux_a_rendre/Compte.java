public class Compte{

    private int solde;
    private int numero;
    
        private static int nbreCompte;

            public Compte(){
                nbreCompte++;
                numero=nbreCompte;
            }

            public int getSolde(){
                return solde;
            }

            public int getNumero(){
                return numero;
            }
    
            
            public static int getNbreCompte(){
                return nbreCompte;
            }
    
            public void setSolde(int solde){
                this.solde=solde;
                
            }
    
            public void setNbreCompte(int nbreCompte){
                this.nbreCompte=nbreCompte;
            }
    
            
            public void depot(){
                System.out.println("Numero: "+numero+"\nNombre de compte: "+nbreCompte+"\nSolde: "+solde);
    
            }
    
    
            
}