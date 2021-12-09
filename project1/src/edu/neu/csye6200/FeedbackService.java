package edu.neu.csye6200;


import edu.neu.csye6200.dao.FeedbackDaoImpl;

public class FeedbackService {
	
	public void addFeedback(Feedback feedback) throws Exception {
		FeedbackDaoImpl feedbackDao = new FeedbackDaoImpl();
		feedbackDao.addFeedback(feedback);
	}
	
	
//	public List<Feedback> getAllReviewsOfTeacher(Teacher teacher) throws Exception {
//		FeedbackDaoImpl feedbackDao = new FeedbackDaoImpl();
//	}
//	
//	public double getAverageRatingOfTeacher(Teacher teacher) throws Exception {
//		
//	}
//
//    public LocalDate trackNextReviewdate(Teacher teacher) throws Exception {
//		
//	}
	
}
