package tn.esprit.spring.wecare.Repositories.Forum;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.wecare.Entities.Forum.Post;


@Repository
public interface PostRepository  extends JpaRepository<Post, Long>{
	@Query("SELECT COUNT(*) FROM Post ")
    long totalPosts();


}
