package kz.bitlab.techboot.springsecurityboot.api;


import kz.bitlab.techboot.springsecurityboot.dto.CourseDTO;
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
    public List<CourseDTO> courseList(){
        return courseService.getCourses();
    }

    @GetMapping(value = "{id}")
    public CourseDTO getCourse(@PathVariable(name = "id") Long id){
        return courseService.getCourse(id);
    }

    @PostMapping
    public CourseDTO addCourse(@RequestBody CourseDTO course){
        return courseService.addCourse(course);
    }

    @PutMapping
    public CourseDTO updateCourse(@RequestBody CourseDTO course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping(value = "{id}")
    public void deleteCourse(@PathVariable(name = "id") Long id){
        courseService.deleteCourse(id);
    }

}
