package Cap.SpringBoot.Caching;

public interface BookRepository {
	
	Book getByIsbn(String isbn);

}
