package collection1;
import java.util.ArrayList;

public class UseStoryBook {

	public static void main(String[] args) {
		StoryBook s1=new StoryBook("poniyin selvan",242,"historic",648);
		StoryBook s2=new StoryBook("the chronicles of narnia",300,"fantasy",800);
		StoryBook s3=new StoryBook("pirates of the carrabian",600,"mystery",2400);
		StoryBook s4=new StoryBook("finding nemo",180,"aquarium",340);
		StoryBook s5=new StoryBook("spider man",82,"thriller fantasy",600);
		StoryBook s6=new StoryBook("poppey",43,"cartoon",120);
		StoryBook s7=new StoryBook("thor",67,"thriller fantasy",110);
		StoryBook s8=new StoryBook("iron man",120,"scientific thriller",134);
		
		ArrayList<StoryBook>storyBooks=new ArrayList<>();
		storyBooks.add(s1);
		storyBooks.add(s2);
		storyBooks.add(s3);
		storyBooks.add(s4);
		storyBooks.add(s5);
		storyBooks.add(s6);
		storyBooks.add(s7);
		storyBooks.add(s8);
		int max=0;
		StoryBook q=s1;
		for(int i=0;i<storyBooks.size();i++) {
			if(storyBooks.get(i).getPrice()>max) {
				max=storyBooks.get(i).getPrice();
				q=storyBooks.get(i);
				
			}
		}
		System.out.println(q.getTitle().toUpperCase()+" "+q.getGenre()+" "+q.getPages()+" "+q.getPrice());
		int min=s1.getPages();
		for(StoryBook x:storyBooks) {
			if(x.getPrice()<min) {
				min=x.getPrice();
				q=x;
			}
		}
		System.out.println(q.getTitle().toUpperCase().charAt(0)+" "+q.getGenre().toUpperCase().charAt(q.getGenre().length()-1)+" "+q.getPages()+" "+q.getPrice());
		
		ArrayList<StoryBook>pagesGreaterThan500=new ArrayList<>();
		
		storyBooks.forEach(x->{ if(x.getPages()>500) {
			pagesGreaterThan500.add(x);
		}	
		});
		System.out.println(pagesGreaterThan500);
		}

	

}
