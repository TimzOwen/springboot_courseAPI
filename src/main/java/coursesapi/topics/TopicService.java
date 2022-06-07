package coursesapi.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {	
	List<Topics> topics = Arrays.asList(
			new Topics("spring","Intro to spring","Welcome to spring"),
			new Topics("Springboot","Intro to springboot","self explanatory"),
			new Topics("English","Intro to spring","Welcome to spring"),
			new Topics("Luo","Intro to springboot","self explanatory")
			);	
	
	public List<Topics> getAllTopics() {
		return topics;
	}
	
	public Topics getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
}
