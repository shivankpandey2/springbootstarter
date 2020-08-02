package app.springbootstarter.courses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository topicRepository;

	public List<Course> getAllCourses(String topicId) {
		return topicRepository.findByTopicId(topicId);
		//return (List<Course>) topicRepository.findAll();
	}

	public Optional<Course> getCourse(String id) {
		return topicRepository.findById(id);
	}

	public void addCourse(Course course) {
		topicRepository.save(course);
	}

	public void updateCourse(Course course) {

		topicRepository.save(course);
	}

	public void deleteCourse(String id) {
		topicRepository.deleteById(id);
	}
}
