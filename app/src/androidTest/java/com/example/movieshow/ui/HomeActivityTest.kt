package com.example.movieshow.ui
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import com.example.movieshow.R
import com.example.movieshow.utils.DataDummy
import org.junit.Test
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule


class HomeActivityTest {

    private val dummyTvShow = DataDummy.generateDummyTvShow()
    private val dummyMovie = DataDummy.generateDummyMoview()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun testloadMovie() {
        onView(withId(R.id.rv_movie))
            .check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
            dummyMovie.size))
    }


    @Test
    fun testloadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.juduldetail)).check(matches(isDisplayed()))
        onView(withId(R.id.juduldetail)).check(matches(withText(dummyMovie[0].judul)))
        onView(withId(R.id.deskripsidetail)).check(matches(isDisplayed()))
        onView(withId(R.id.deskripsidetail)).check(matches(withText(dummyMovie[0].keterangan)))
    }

    @Test
    fun TestBtnDetailMovie(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.btnSHare)).perform(click())
    }

    @Test
    fun testloadTvShowandDetail(){
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tv)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
            dummyTvShow.size))
        onView(withId(R.id.rv_tv)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.juduldetail)).check(matches(isDisplayed()))
        onView(withId(R.id.juduldetail)).check(matches(withText(dummyTvShow[0].judul)))
        onView(withId(R.id.deskripsidetail)).check(matches(isDisplayed()))
        onView(withId(R.id.deskripsidetail)).check(matches(withText(dummyTvShow[0].keterangan)))
    }

    @Test
    fun TestBtnDetailTv(){
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tv)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.btnSHare)).perform(click())
    }



}