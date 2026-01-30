package egovframework.lawmatcher.review.controller;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.lawmatcher.review.service.ReviewService;
import egovframework.lawmatcher.review.vo.AmendmentReviewVO;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Resource(name = "reviewService")
    private ReviewService reviewService;

    @GetMapping("/{id}")
    public AmendmentReviewVO getReview(@PathVariable("id") int id) throws Exception {
        return reviewService.getAmendmentReviewById(id);
    }

    @GetMapping
    public List<AmendmentReviewVO> getReviewList() throws Exception {
        return reviewService.getAmendmentReviewList();
    }

    @PostMapping
    public int createReview(@RequestBody AmendmentReviewVO review) throws Exception {
        return reviewService.createAmendmentReview(review);
    }

    @PutMapping("/{id}")
    public int updateReview(@PathVariable("id") int id, @RequestBody AmendmentReviewVO review) throws Exception {
        review.setId(id);
        return reviewService.updateAmendmentReview(review);
    }

    @DeleteMapping("/{id}")
    public int deleteReview(@PathVariable("id") int id) throws Exception {
        return reviewService.deleteAmendmentReview(id);
    }
}
