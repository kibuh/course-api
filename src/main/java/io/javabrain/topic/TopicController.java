package io.javabrain.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;

	@RequestMapping("/topics")
	public List<Topic> getgetAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}

//	@RequestMapping(method = RequestMethod.POST, value = "/topics")
//	public List<Topic> addTopic(@RequestBody Topic topics) {
//
//		return topicService.addTopic(topics);
//	}

	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void addTopic(@RequestBody Topic topics) {

		topicService.addTopic(topics);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
	public void UpdateTopic(@RequestBody Topic topics, @PathVariable String id) {

		topicService.updateTopic(topics, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
