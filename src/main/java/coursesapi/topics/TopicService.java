package coursesapi.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {	
	List<Topics> topics = new ArrayList<>(Arrays.asList(
			new Topics("spring","Intro to spring","Welcome to spring"),
			new Topics("Springboot","Intro to springboot","self explanatory"),
			new Topics("English","Intro to spring","Welcome to spring"),
			new Topics("Luo","Intro to springboot","self explanatory")
			));	
	
	public List<Topics> getAllTopics() {
		return topics;
	}
	
	public Topics getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topics topic) {
		topics.add(topic);
	}
	
	//update topic [get the specific id and update 
	public void updateTopic(String id,Topics topic) {
		for(int i=0; i<topics.size(); i++) {
			Topics t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i,topic);
				return;
			}
		}
	}
	
	// delete topic
	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
		
	}
}
