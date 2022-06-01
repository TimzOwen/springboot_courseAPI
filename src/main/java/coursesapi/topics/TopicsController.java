package coursesapi.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	@RequestMapping("topics")
	public List<Topics> getAllTopics() {
		return Arrays.asList(
				new Topics("spring","Intro to spring","Welcome to spring"),
				new Topics("Springboot","Intro to springboot","self explanatory"),
				new Topics("spring","Intro to spring","Welcome to spring"),
				new Topics("Springboot","Intro to springboot","self explanatory")
				);
	}
}
