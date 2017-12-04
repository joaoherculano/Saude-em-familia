package com.example.central.projeto.adapter

import android.widget.Toast
import com.example.central.projeto.models.beans.beans
import com.google.firebase.database.*

/**
 * Created by Central on 30/11/2017.
 */
class SaveData (internal var db: DatabaseReference){

    internal var saved: Boolean? = null
    internal var Complaints = ArrayList<beans>()

//    fun save(Complaint: beans?): Boolean? {
//        if (Complaint == null) {
//            saved = false
//        } else {
//            try {
//                db.child("list_psfs").push().setValue(Complaint)
//                saved = true
//            } catch (e: DatabaseException) {
//                e.printStackTrace()
//                saved = false
//            }
//        }
//        return saved
//    }
//se for adicionado faz --->
    fun retrieve(): ArrayList<beans> {

        db.addChildEventListener(object : ChildEventListener {

            override fun onChildAdded(dataSnapshot: DataSnapshot, s: String?) {
                Complaints.clear()
                for (ds in dataSnapshot.children) {
                    val Complaint = ds.getValue(beans::class.java)
                    if (Complaint != null) {
                        Complaints.add(Complaint)
                    }

                }
            }
//se for mudado
            override fun onChildChanged(dataSnapshot: DataSnapshot, s: String?) {
                Complaints.clear()
                for (ds in dataSnapshot.children) {
                    val Complaint = ds.getValue(beans::class.java)
                    if (Complaint != null) {
                        Complaints.add(Complaint)
                    }
                }
            }
//se for removido
            override fun onChildRemoved(dataSnapshot: DataSnapshot) {
                Complaints.clear()
                for (ds in dataSnapshot.children) {
                    val Complaint = ds.getValue(beans::class.java)
                    if (Complaint != null) {
                        Complaints.add(Complaint)
                    }
                }
            }
            override fun onChildMoved(dataSnapshot: DataSnapshot, s: String?) {
                Complaints.clear()
                for (ds in dataSnapshot.children) {
                    val Complaint = ds.getValue(beans::class.java)
                    if (Complaint != null) {
                        Complaints.add(Complaint)
                    }
                }
            }
            override fun onCancelled(databaseError: DatabaseError) {}
        })

        return Complaints
    }

}