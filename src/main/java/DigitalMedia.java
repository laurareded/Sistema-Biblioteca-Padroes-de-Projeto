public class DigitalMedia extends LibraryItem {

    private final String fileFormat;

    public DigitalMedia(String title, String author, int publicationYear, String fileFormat) {
        super(title, author, publicationYear);
        this.fileFormat = fileFormat;
    }

    @Override
    public void borrow() {
        System.out.println("A mídia digital '" + title + "' foi baixada (emprestada).");
    }

    @Override
    public void returnItem() {
        System.out.println("O acesso à mídia digital '" + title + "' foi revogado (devolvido).");
    }

    public void play() {
        System.out.println("Reproduzindo a mídia digital no formato " + fileFormat + ".");
    }
}