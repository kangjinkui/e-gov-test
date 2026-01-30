package egovframework.lawmatcher.review.mapper;

import java.util.List;
import egovframework.lawmatcher.review.vo.AmendmentReviewVO;

public interface ReviewMapper {
    AmendmentReviewVO selectAmendmentReviewById(int id) throws Exception;
    List<AmendmentReviewVO> selectAmendmentReviewList() throws Exception;
    int insertAmendmentReview(AmendmentReviewVO review) throws Exception;
    int updateAmendmentReview(AmendmentReviewVO review) throws Exception;
    int deleteAmendmentReview(int id) throws Exception;
}
