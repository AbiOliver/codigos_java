public class Livro {

    // atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int numeroPaginas;
    private boolean emprestado;
    private int quantidadeExemplar;
    private int quantidadeEmprestado = 0;
    private int quantidadeDevolvido = 0;

    // construtores
    public Livro(String titulo, String autor, int anoPublicacao, int numeroPaginas, int quantidadeExemplar,
            boolean emprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.numeroPaginas = numeroPaginas;
        this.quantidadeExemplar = quantidadeExemplar;
        this.emprestado = emprestado;
    }

    public Livro(String titulo, String autor) {
        this.anoPublicacao = 0;
        this.numeroPaginas = 0;
        this.quantidadeExemplar = 0;
        this.emprestado = false;

    }

    public Livro() {
        this(" ", " ", 0, 0, 0, false);
    }

    // gets e setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public int getquantidadeExemplar() {
        return quantidadeExemplar;
    }

    public void setquantidadeExemplar() {
        this.quantidadeExemplar = quantidadeExemplar;
    }

    public boolean getEmprestado() {
        return emprestado;
    }

    public void setEmprestado(Boolean emprestado) {
        this.emprestado = emprestado;
    }

    // metodos
    public void emprestar() {
        if (quantidadeExemplar > 0) {
            this.emprestado = true;
            quantidadeExemplar -= 1;
            quantidadeEmprestado++;
            System.out.println("->Livro emprestado");
        }
         if (quantidadeExemplar == 0) {
            System.out.println("->Não há mais exemplares para emprestar.");
        }
    }

    public void devolver() {
        if (quantidadeExemplar < 10) {
            this.emprestado = false;
            quantidadeExemplar += 1;
            System.out.println("->Livro devolvido");
            quantidadeDevolvido += 1;
        }
    }

    @Override
    public String toString() {

        String s = "------------------------------------------ \n";
        s += "Livro: " + titulo + "\nAutor : " + autor + "\nAno: " + anoPublicacao + "\nPáginas: " + numeroPaginas;
        s += "\nQuantidade de exemplares emprestados: " + quantidadeEmprestado + "\n";
        s += "Quantidade de exemplares devolvidos: " + quantidadeDevolvido + "\n";
        s += "Quantidade de exemplares disponíveis: " + quantidadeExemplar + "\n";
        return s + "\n------------------------------------------";

    }
}
