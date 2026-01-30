package egovframework.lawmatcher.review.service;

import java.util.List;
import egovframework.lawmatcher.review.vo.AmendmentReviewVO;

public interface ReviewService {
    AmendmentReviewVO getAmendmentReviewById(int id) throws Exception;
    List<AmendmentReviewVO> getAmendmentReviewList() throws Exception;
    int createAmendmentReview(AmendmentReviewVO review) throws Exception;
    int updateAmendmentReview(AmendmentReviewVO review) throws Exception;
    int deleteAmendmentReview(int id) throws Exception;
}
