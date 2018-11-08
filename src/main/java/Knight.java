
public class Knight {
	Quest quest;
	String title;
	String victory;
	
	 Knight(Quest quest) {
		this.quest = quest;
		this.title = quest.title();
		this.victory = quest.victory();
	}
	 void processQuest() {
		 this.quest.process();
	 }
}

