import java.util.*;

class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    String nome;
    int anoDeCriacao;
    String ide;
    
    public LinguagemFavorita(String nome, int anoDeCriacao, String ide){
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }
    
    public String toString(){
        return nome + " (" + anoDeCriacao + ") - " + ide;
    }
    
    public int compareTo(LinguagemFavorita lf){
        return this.nome.compareTo(lf.nome);
    }
}

public class Main{
    public static void main(String[] args){
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>();
        linguagens.add(new LinguagemFavorita("Java", 1995, "Eclipse"));
        linguagens.add(new LinguagemFavorita("Python", 1991, "PyCharm"));
        linguagens.add(new LinguagemFavorita("JavaScript", 1995, "WebStorm"));
        
        System.out.println("Ordem de Inserção:");
        for(LinguagemFavorita lf : linguagens){
            System.out.println(lf);
        }
        
        System.out.println("\nOrdem Natural (nome):");
        Set<LinguagemFavorita> linguagensOrdenadas = new TreeSet<>(linguagens);
        for(LinguagemFavorita lf : linguagensOrdenadas){
            System.out.println(lf);
        }
        
        System.out.println("\nIDE:");
        Set<LinguagemFavorita> linguagensIDE = new TreeSet<>(new Comparator<LinguagemFavorita>(){
            public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
                return lf1.ide.compareTo(lf2.ide);
            }
        });
        linguagensIDE.addAll(linguagens);
        for(LinguagemFavorita lf : linguagensIDE){
            System.out.println(lf);
        }
        
        System.out.println("\nAno de criação e nome:");
        Set<LinguagemFavorita> linguagensAnoNome = new TreeSet<>(new Comparator<LinguagemFavorita>(){
            public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
                int result = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
                if(result == 0){
                    result = lf1.nome.compareTo(lf2.nome);
                }
                return result;
            }
        });
        linguagensAnoNome.addAll(linguagens);
        for(LinguagemFavorita lf : linguagensAnoNome){
            System.out.println(lf);
        }
        
        System.out.println("\nNome, ano de criacao e IDE:");
        Set<LinguagemFavorita> linguagensNomeAnoIDE = new TreeSet<>(new Comparator<LinguagemFavorita>(){
            public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
                int result = lf1.nome.compareTo(lf2.nome);
                if(result == 0){
                    result = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
                    if(result == 0){
                        result = lf1.ide.compareTo(lf2.ide);
                    }
                }
                return result;
            }
        });
        linguagensNomeAnoIDE.addAll(linguagens);
        for(LinguagemFavorita lf : linguagensNomeAnoIDE){
            System.out.println(lf);
            System.out.println("\nNome, ano de criacao e IDE:");
            Set<LinguagemFavorita> linguagensNomeAnoIDE = new TreeSet<>(new Comparator<LinguagemFavorita>(){
                public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2){
                    int result = lf1.nome.compareTo(lf2.nome);
                    if(result == 0){
                        result = Integer.compare(lf1.anoDeCriacao, lf2.anoDeCriacao);
                        if(result == 0){
                            result = lf1.ide.compareTo(lf2.ide);
                        }
                    }
                    return result;
                }
            });
            linguagensNomeAnoIDE.addAll(linguagens);
            for(LinguagemFavorita lf : linguagensNomeAnoIDE){
                System.out.println(lf);
            }
        }
    }
}        
        