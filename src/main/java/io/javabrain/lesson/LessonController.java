package io.javabrain.lesson;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrain.course.Course;
import io.javabrain.topic.Topic;

@RestController
public class LessonController {

	@Autowired
	LessonService lessonService;

	@RequestMapping("/courses/{id}/lessons")
	public List<Lesson> getgetAllLessons(@PathVariable String id) {
		return lessonService.getAllLessons(id);
	}

	@RequestMapping("/courses/{courseId}/lessons/{id}")
	public Lesson getLesson(@PathVariable String id) {
		return lessonService.getLesson(id);
	}



	@RequestMapping(method = RequestMethod.POST, value = "/courses/{courseId}/lessons")
	public void addLesson(@PathVariable String courseId, @RequestBody Lesson lesson) {

		lesson.setCourse(new Course(courseId,"","",""));
		
		lessonService.addLesson(lesson);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/courses/{courseId}/lessons/{id}")
	public void UpdateLesson(@RequestBody Lesson lesson, @PathVariable String courseId, @PathVariable String id) {
		lesson.setCourse(new Course(courseId,"","",""));
		lessonService.updateLesson(lesson);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/courses/{courseId}/lessons/{id}")
	public void deleteLesson(@PathVariable String id) {
		lessonService.deleteLesson(id);
	}
}
