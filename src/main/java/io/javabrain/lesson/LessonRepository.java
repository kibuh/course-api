package io.javabrain.lesson;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson,String> {

	public List<Lesson> findByCourseId(String topicId);
}
