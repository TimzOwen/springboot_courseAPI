package coursesapi.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("topics")
	public List<Topics> getAllTopics() {
		return topicservice.getAllTopics();
	}
}
