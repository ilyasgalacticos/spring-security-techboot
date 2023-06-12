package kz.bitlab.techboot.springsecurityboot.api;


import kz.bitlab.techboot.springsecurityboot.model.Course;
import kz.bitlab.techboot.springsecurityboot.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
@RequiredArgsConstructor
public class CourseRestController {

    private final CourseService courseService;

    @GetMapping
    public List<Course> courseList(){
        return courseService.getCourses();
    }

    @GetMapping(value = "{id}")
    public Course getCourse(@PathVariable(name = "id") Long id){
        return courseService.getCourse(id);
    }

    @PostMapping
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @PutMapping
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping(value = "{id}")
    public void deleteCourse(@PathVariable(name = "id") Long id){
        courseService.deleteCourse(id);
    }

}
