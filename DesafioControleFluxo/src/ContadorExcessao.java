       public class ContadorExcessao {
        public static void main(String[] args) {
            
            int parametroUm = 45;
            int parametroDois = 29;
            System.out.println("Primeiro parâmetro digitado:" + parametroUm);
            System.out.println("Segundo parâmetro digitado:" + parametroDois);            
            
            try {
                contar(parametroUm, parametroDois);
            
            }catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            }
            
        }
        static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
            if (parametroUm > parametroDois)
                throw new ParametrosInvalidosException();
                    
            int contagem = parametroDois - parametroUm;
            for (int indice = 1; indice <= contagem; indice++) {
                System.out.println("Número: " + indice);
            }
            
        }
    
    }