// AUTO-GENERATED FILE. DO NOT MODIFY.
//
// This class was automatically generated by Apollo GraphQL plugin from the GraphQL queries it found.
// It should not be modified by hand.
//
package com.example.fragment_in_fragment.fragment

import com.apollographql.apollo.api.Fragment
import com.apollographql.apollo.api.Operation
import com.apollographql.apollo.api.internal.ResponseAdapter
import com.example.fragment_in_fragment.fragment.adapter.PilotFragmentImpl_ResponseAdapter
import kotlin.String

class PilotFragmentImpl : Fragment<PilotFragmentImpl.Data> {
  override fun adapter(): ResponseAdapter<Data> {
    return PilotFragmentImpl_ResponseAdapter
  }

  override fun variables(): Operation.Variables = Operation.EMPTY_VARIABLES

  /**
   * An individual person or character within the Star Wars universe.
   */
  data class Data(
    override val __typename: String = "Person",
    /**
     * The name of this person.
     */
    override val name: String?,
    /**
     * A planet that this person was born on or inhabits.
     */
    override val homeworld: Homeworld?
  ) : PilotFragment, Fragment.Data {
    /**
     * A large mass, planet or planetoid in the Star Wars Universe, at the time of
     * 0 ABY.
     */
    interface Homeworld : PilotFragment.Homeworld {
      override val __typename: String

      data class PlanetHomeworld(
        override val __typename: String,
        /**
         * The name of this planet.
         */
        override val name: String?
      ) : PilotFragment.Homeworld, PilotFragment.Homeworld.Planet, PlanetFragment, Homeworld

      data class OtherHomeworld(
        override val __typename: String
      ) : PilotFragment.Homeworld, Homeworld
    }
  }
}
