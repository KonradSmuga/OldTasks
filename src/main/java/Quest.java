
public interface Quest {
	void process();
	
	String title();
	
	default String victory() {
		return	"you win!";
	}
}
