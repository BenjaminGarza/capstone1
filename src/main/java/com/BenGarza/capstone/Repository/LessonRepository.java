package com.BenGarza.capstone.Repository;

import com.BenGarza.capstone.Models.Lesson;
import com.BenGarza.capstone.Models.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LessonRepository
        extends JpaRepository<Lesson, Long> {
    Optional<Lesson> findLessonById(Long id);
}
