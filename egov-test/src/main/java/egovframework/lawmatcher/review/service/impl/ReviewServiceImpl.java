package egovframework.lawmatcher.review.service.impl;

import java.util.List;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import egovframework.lawmatcher.review.mapper.ReviewMapper;
import egovframework.lawmatcher.review.service.ReviewService;
import egovframework.lawmatcher.review.vo.AmendmentReviewVO;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {

    @Resource(name = "reviewMapper")
    private ReviewMapper reviewMapper;

    @Override
    public AmendmentReviewVO getAmendmentReviewById(int id) throws Exception {
        return reviewMapper.selectAmendmentReviewById(id);
    }

    @Override
    public List<AmendmentReviewVO> getAmendmentReviewList() throws Exception {
        return reviewMapper.selectAmendmentReviewList();
    }

    @Override
    public int createAmendmentReview(AmendmentReviewVO review) throws Exception {
        return reviewMapper.insertAmendmentReview(review);
    }

    @Override
    public int updateAmendmentReview(AmendmentReviewVO review) throws Exception {
        return reviewMapper.updateAmendmentReview(review);
    }

    @Override
    public int deleteAmendmentReview(int id) throws Exception {
        return reviewMapper.deleteAmendmentReview(id);
    }
}
